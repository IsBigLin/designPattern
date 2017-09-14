package designPattern.decorate.test2;

/**
 * Created by Linnq on 2017/8/31.
 */
public class DecoratorCap extends Decorator {
    public DecoratorCap(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        System.out.println("戴帽子");
    }
}
