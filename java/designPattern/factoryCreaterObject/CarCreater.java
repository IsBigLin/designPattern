package designPattern.factoryCreaterObject;

/**
 * Created by lnq on 2017/5/22.
 */
public class CarCreater implements FactoryCreater {
    @Override
    public <T extends Car> T creater(Class<T> clazz) {
        T car = null;
        try {
            car =  (T)clazz.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }
}
