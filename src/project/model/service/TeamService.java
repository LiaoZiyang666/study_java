package project.model.service;


import project.model.domain.Architect;
import project.model.domain.Designer;
import project.model.domain.Employee;
import project.model.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: project.model.service
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/19 - 14:03
 * Version - v 1.0
 */
public class TeamService {
    private static int counter = 1; //给memberID进行自动赋值的基数
    private final int MAX_MEMBER = 5; //表示开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];//开发团队的数组
    private int total;//记录开发团队中的人数


    /**
     * 获取当前所有员工。
     *
     * @return 返回：包含所有员工对象的数组
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];     //this.team[i] 的数组长度为5，total超过5就会显示异常
        }
        return team;
    }

    /**
     * 向团队中添加成员
     *
     * @param employee 待添加的成员的对象
     * @throws TeamException
     */
    public void addMember(Employee employee) throws TeamException {

        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if (!(employee instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
        //该员工已是某团队成员
        //该员工正在休假，无法添加
        Programmer p = (Programmer) employee;
        Status status = p.getStatus();
        switch (status) {
            case BUSY:
                throw new TeamException("该员工已是某团队成员");
            case VOCATION:
                throw new TeamException("该员工正在休假，无法添加");
        }
        //该员工已在本开发团队中
        boolean isExist = isExist(p);
        if (isExist) {
            throw new TeamException("该员工已在本开发团队中");
        }

        //记录程序员，设计师，架构师的个数
        int progNum = 0, desNum = 0, arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                arcNum++;
            } else if (team[i] instanceof Designer) {
                desNum++;
            } else {
                progNum++;
            }
        }

        if (p instanceof Architect) {//团队中至多只能有一名架构师
            if (arcNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        }else if (p instanceof Designer) {//团队中至多只能有两名设计师
            if (desNum >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        }else {//团队中至多只能有三名程序员
            if (progNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }
        //代码如果执行到此位置，意味着p是可以添加team数字中的
        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);

    }

    private boolean isExist(Programmer p) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == p.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除指定ID的员工对象。
     * @param memberId 指定员工的ID
     * @throws TeamException 找不到指定的员工
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                //找到这个员工，需要调整其相关属性
                team[i].setStatus(Status.FREE);
                //员工的memberId可以不修改
                break;
            }
        }
        //没找到
        if (i == total ) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }
        //调整数组
        for (int j = i; j < total -1; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;


    }


}


















