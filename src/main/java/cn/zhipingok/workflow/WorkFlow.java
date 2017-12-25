package cn.zhipingok.workflow;


import java.util.ArrayList;
import java.util.List;

/***
 * 工作流程的定义，
 * 用于定义工作流程
 */
public class WorkFlow {
    private List<WorkNode> nodes = new ArrayList<>();
    private List<WorkNodeRelative> relations = new ArrayList<>();

    //开始结点
    private WorkNode begin;

    //结束结点
    private WorkNode end;


    public void setBegin(WorkNode begin){
        this.begin = begin;
        addNode(begin);
    }

    public void setEnd(WorkNode end){
        this.end = end;
        addNode(end);
    }

    public void addNode(WorkNode node){
        nodes.add(node);
    }

    public void addRelative(WorkNodeRelative relative){
        relations.add(relative);
    }

    public WorkNode getNode(String name){
        return nodes.stream()
                .filter(n -> n.getName().equals(name)).findFirst()
                .get();
    }

    public String getGraphStr(){

        WorkNode n = nodes.get(0);
        return n.toString();

    }





}
