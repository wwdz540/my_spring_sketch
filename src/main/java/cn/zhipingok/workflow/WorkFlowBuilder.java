package cn.zhipingok.workflow;


public class WorkFlowBuilder {
    WorkFlow workFlow = new WorkFlow();

    public static WorkFlowBuilder create(){
        return new WorkFlowBuilder();
    }

    public WorkFlowBuilder addNode(String name){
        workFlow.addNode(new WorkNode(name));
        return this;
    }

    public WorkFlowBuilder addRelative(String relativeName,String beginNode,String endNode){
       WorkNode b = getNode(beginNode);
       WorkNode e = getNode(endNode);

       workFlow.addRelative(WorkNodeRelative.joinTwoNode(relativeName,b,e));
       return this;
    }

    private WorkNode getNode(String name){
       return workFlow.getNode(name);
    }

    public WorkFlow build(){
        return  workFlow;
    }
}
