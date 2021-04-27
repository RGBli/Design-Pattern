package responsibilitychain;

public class ConcreteHandler3 extends Handler {

    @Override
    public void handleMessage(int type) {
        if (type == 4 || type == 6) {
            System.out.println("ConcreteHandler3 解决了问题！");
        } else {
            System.out.println("ConcreteHandler3 解决不了问题......");
            if (nextHandler != null) {
                nextHandler.handleMessage(type);
            } else {
                System.out.println("没有人能处理这个消息");
            }
        }
    }
}