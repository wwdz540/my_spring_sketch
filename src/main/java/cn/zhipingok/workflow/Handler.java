package cn.zhipingok.workflow;

/***
 * 工作节点处理接口，用于选择一个分支
 * @return
 */
public interface Handler<T> {



    WorkNode handle(HandlerObj<T> handlerObj);

    public static class HandlerObj<T>{
        public WorkNode currentNode;
        public WorkFlowInstance instance;
        public T obj;

        public WorkNode getCurrentNode() {
            return currentNode;
        }

        public void setCurrentNode(WorkNode currentNode) {
            this.currentNode = currentNode;
        }

        public WorkFlowInstance getInstance() {
            return instance;
        }

        public void setInstance(WorkFlowInstance instance) {
            this.instance = instance;
        }

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }
}
