package cn.zhipingok.workflow;


import jdk.nashorn.internal.runtime.options.Option;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class WorkFlowBuilder {
    WorkFlow workFlow = new WorkFlow();
    WorkNode begin = new WorkNode("开始");
    WorkNode end = new WorkNode("结束");

    private Handler handler = new SelectPathHandler();

    WorkFlowBuilder(){
        workFlow.setBegin(begin);
    }

    public static WorkFlowBuilder create(){
        return new WorkFlowBuilder();
    }

    public WorkFlowBuilder addNode(String name){
        WorkNode workNode = new WorkNode(name);
        workNode.setHandler(handler);       //set Default handler
        workFlow.addNode(workNode);
        return this;
    }

    public WorkFlowBuilder addRelative(String relativeName,String beginNode,String endNode){


       WorkNode b = StringUtils.isBlank(beginNode)? begin : getNode(beginNode);
       WorkNode e = StringUtils.isBlank(endNode) ? end:getNode(endNode);

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
