package decorate.test2;

/**
 * Created by Linnq on 2017/8/31.
 */
public abstract class Decorator implements Human{
    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }
}
