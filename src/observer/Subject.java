package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // 它的所有观察者
    private List<Observer> observers = new ArrayList<>();

    // 它的状态
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
