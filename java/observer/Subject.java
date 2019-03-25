package observer;

/**
 * 主题对象（被观察者） - 一个有状态的对象
 * 一个主题对象可以注册多个观察者 {@link Observer}
 *
 * 本例子中，模拟 老师对象
 * @author naiqing.lin
 * @date 3/25/19 4:53 PM
 */

public interface Subject {
     void register(Observer ob);
     void remove(Observer ob);
     void send();
}
