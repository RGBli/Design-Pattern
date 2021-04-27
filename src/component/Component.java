package component;

public abstract class Component {
    // 职位
    private String position;

    // 工作内容
    private String jobs;

    public Component(String position, String jobs) {
        this.position = position;
        this.jobs = jobs;
    }

    public void work() {
        System.out.println("I am " + position + ". I am " + jobs);
    }

    abstract void addComponent(Component component);

    abstract void removeComponent(Component component);

    // 检查下属
    abstract void check();
}
