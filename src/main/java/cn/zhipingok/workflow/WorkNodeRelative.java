package cn.zhipingok.workflow;

public class WorkNodeRelative {
    private String name;
    private WorkNode begin;
    private WorkNode end;


    public static WorkNodeRelative joinTwoNode(String name,WorkNode begin, WorkNode end){
        WorkNodeRelative workNodeRelative = new WorkNodeRelative();
        workNodeRelative.name = name;
        workNodeRelative.begin = begin;
        workNodeRelative.end = end;

        begin.addNext(workNodeRelative);
        end.addPre(workNodeRelative);
        return workNodeRelative;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkNode getBegin() {
        return begin;
    }

    public void setBegin(WorkNode begin) {
        this.begin = begin;
    }

    public WorkNode getEnd() {
        return end;
    }

    public void setEnd(WorkNode end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "WorkNodeRelative{" +
                "name='" + name + '\'' +
                ", end=" + end +
                '}';
    }
}
