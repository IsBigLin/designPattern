package responsibilityChain;

/**
 * @author naiqing.lin
 * @date 3/26/19 11:38 AM
 */

public class Client {
    public static void main(String args[]) {
        Handler handler = new LeaderHandler();
        handler.setNext(new BossHandler());
        handler.deal(11);
    }
}
