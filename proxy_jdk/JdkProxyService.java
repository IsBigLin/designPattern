package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lnq on 2017/4/28.
 */
public class JdkProxyService implements InvocationHandler{
    private Object target;

    public JdkProxyService(JdkService target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy begin");
        Object result = method.invoke(target,args);
        System.out.println("proxy end");
        return result;
    }
    public Object getProxy(){   //获取代理类
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public static void main(String args[]){
        JdkService service = new JdkRealService();
        JdkProxyService jdkproxyService = new JdkProxyService(service);
        JdkService proxyService = (JdkService) jdkproxyService.getProxy(); //获取代理类
        proxyService.say();   //代码运行后会生成一个$proxy extends Proxy implements Service 代理类，可以通过代码反编译查看。
                                // 执行代理对象的方法，其实就是执行InvocationHandle对象的invoke方法，
                                //传入的参数分别是当前代理对象，当前执行的方法和参数。super.h.invoke(this, m3, null);
        proxyService.say2();
    }
}
