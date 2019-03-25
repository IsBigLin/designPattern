package observer;

/**
 * @author naiqing.lin
 * @date 3/25/19 5:17 PM
 */

public class test {
    public static void main(String args[]) {
        Subject subject = new ConcreteSubject();
        subject.register(new AObserver());
        subject.register(new BObserver());
        subject.send();
    }
}
