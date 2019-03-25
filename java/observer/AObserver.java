package observer;

/**
 * 学生A
 *
 * @author naiqing.lin
 * @date 3/25/19 5:08 PM
 */

public class AObserver implements Observer {
    @Override
    public void receive(String val) {
        System.out.println("学生A"+val);
    }
}
