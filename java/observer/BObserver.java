package observer;

/**
 * B学生
 *
 * @author naiqing.lin
 * @date 3/25/19 5:09 PM
 */

public class BObserver implements Observer {
    @Override
    public void receive(String val) {
        System.out.println("学生B"+val);
    }
}
