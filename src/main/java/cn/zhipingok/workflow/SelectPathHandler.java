package cn.zhipingok.workflow;

/***
 * 根据传入的路径名来选择
 */
public class SelectPathHandler implements Handler<String> {
    @Override
    public WorkNode handle(HandlerObj<String> handlerObj) {
       return handlerObj.getCurrentNode().getNextNode(handlerObj.getObj());
    }
}
