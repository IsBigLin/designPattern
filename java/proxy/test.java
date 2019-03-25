package proxy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Linnq on 2017/8/31.
 */
public class test {
    public static void main(String args[]){
        Subject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.say();
        System.out.println();
        List list = new LinkedList<>();
    }

}
