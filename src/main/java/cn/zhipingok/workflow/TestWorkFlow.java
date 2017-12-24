package cn.zhipingok.workflow;

public class TestWorkFlow {
    public static void main(String[] args) {

        WorkFlow flow = WorkFlowBuilder.create()
                .addNode("填写请假条")
                .addNode("张三审核")
                .addNode("李四审核")
                .addNode("王五审核")

                .addRelative("提交","填写请假条","张三审核")
                .addRelative("同意","张三审核","李四审核")
                .build();

        System.out.println(flow.getGraphStr());


    }
}
