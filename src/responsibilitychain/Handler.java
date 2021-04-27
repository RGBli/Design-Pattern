package responsibilitychain;

public abstract class Handler {
    // 下一个责任链成员
    protected Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 处理传递过来的消息
    public abstract void handleMessage(int type);
}
