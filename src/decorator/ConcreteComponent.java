package decorator;

public class ConcreteComponent extends Component {
    @Override
    void make() {
        System.out.println("正在做肉夹馍");
    }
}
