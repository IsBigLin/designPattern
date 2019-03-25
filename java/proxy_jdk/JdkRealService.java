package proxy_jdk;

/**
 * Created by lnq on 2017/4/28.
 */
public class JdkRealService implements JdkService{
    @Override
    public void say() {
        System.out.println("realService");
    }

    public void say2(){
        System.out.println("222222222222");
    }
}
