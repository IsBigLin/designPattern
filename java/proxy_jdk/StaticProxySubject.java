package proxy_jdk;

/**
 * Created by lnq on 2017/4/28.
 */
public class StaticProxySubject implements StaticSubject{
    StaticSubject staticSubject;

    public StaticProxySubject(StaticSubject staticSubject) {
        this.staticSubject = staticSubject;
    }

    @Override
    public void say() {
        System.out.println("proxy say begin");
        staticSubject.say();
        System.out.println("proxy say end");
    }

    public static void main(String args[]){
        StaticProxySubject proxy = new StaticProxySubject(new StaticRealSubject());
        proxy.say();
    }    //静态代理模型  -- 在编译期就已经确定了代理类；
}
