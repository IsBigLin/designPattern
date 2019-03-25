package observer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author naiqing.lin
 * @date 3/25/19 5:05 PM
 */

public class ConcreteSubject implements Subject {
    private static final Set<Observer> OBSERVERS = new HashSet<>();

    @Override
    public void register(Observer ob) {
        OBSERVERS.add(ob);
    }

    @Override
    public void remove(Observer ob) {
        OBSERVERS.remove(ob);
    }

    @Override
    public void send() {
        OBSERVERS.forEach((ob)->{
            ob.receive("开学");
        });
    }
}
