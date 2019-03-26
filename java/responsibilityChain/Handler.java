package responsibilityChain;

/**
 * @author naiqing.lin
 * @date 3/26/19 11:25 AM
 */

public abstract class Handler {
    private Handler chain;

    final Handler getNext() {
        return chain;
    }

    final void setNext(Handler handler) {
        this.chain = handler;
    }

    abstract void deal(int val);
}
