package proxy_jdk;

/**
 * Created by lnq on 2017/4/28.
 */
public class StaticRealSubject implements StaticSubject {
    @Override
    public void say() {
        System.out.println("real");
    }
}
