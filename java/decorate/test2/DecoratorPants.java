package decorate.test2;

/**
 * Created by Linnq on 2017/8/31.
 */
public class DecoratorPants extends Decorator {
    public DecoratorPants(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        System.out.println("穿裤子");
    }

    public static void main(String args[]){
        Human person = new Human() {
            @Override
            public void wearClothes() {
                System.out.println("穿什么呢？");
            }
        };
        person = new DecoratorPants(new DecoratorWaistcoat(new DecoratorCap(person)));
        person.wearClothes();
    }
}
