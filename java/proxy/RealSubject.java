package proxy;

/**
 * Created by Linnq on 2017/8/31.
 */
public class RealSubject extends Subject {
    @Override
    void say() {
        System.out.println("火车站");
    }
}
