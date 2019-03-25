package designPattern.factoryCreaterObject;

/**
 * Created by lnq on 2017/5/22.
 */
public class Test {
    public static void main(String args[]){
        FactoryCreater factory = new CarCreater();
        Car redCar = factory.creater(RedCar.class);
        Car greenCar = factory.creater(GreenCar.class);
        redCar.color();
        greenCar.color();
    }
}
