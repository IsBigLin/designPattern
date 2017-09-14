package designPattern;

/**
 * Created by lnq on 2017/5/17.
 */
public class Single {
    private static volatile Single SINGLE = null;
    private Single(){}
    public static Single getInstance() {
            if(SINGLE == null){
                synchronized (Single.class){
                    if(SINGLE == null){
                        SINGLE = new Single();
                    }
                }
            }
        // write your code here
        return  SINGLE;  //volatile保证了可见性和有序性，避免了指令重排序。
    }
}
