package cn.zhipingok.workflow;

//工作流实例
public class WorkFlowInstance {
   private WorkFlow workFlow ;
   private WorkNode current;

    public WorkFlow getWorkFlow() {
        return workFlow;
    }

    public void setCurrent(String name){
        current = workFlow.getNode(name);
    }

    public void setWorkFlow(WorkFlow workFlow) {
        this.workFlow = workFlow;
    }

    public <T> void execute(T cmd){
        Handler.HandlerObj<T>  handlerObj = new Handler.HandlerObj<>();
        handlerObj.currentNode = current;
        handlerObj.obj = cmd;
        current = current.getHandler().handle(handlerObj);
    }


}
