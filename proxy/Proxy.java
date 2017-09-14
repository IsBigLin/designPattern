package designPattern.proxy;

/**
 * Created by Linnq on 2017/8/31.
 */
public class Proxy extends Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    void say() {
        System.out.println("黄牛");
        subject.say();
        System.out.println("不需要去火车站");
    }
}
