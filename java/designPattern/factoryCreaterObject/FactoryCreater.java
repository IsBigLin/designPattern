package designPattern.factoryCreaterObject;

/**
 * Created by lnq on 2017/5/22.
 */
public interface FactoryCreater {
    public <T extends designPattern.factoryCreaterObject.Car> T creater(Class<T> clazz);
}
