package designPattern.decorate.test1;

/**
 * Created by Linnq on 2017/8/31.
 */
public class BaseCostPrice extends Price {
    @Override
    public int calPrice(int mile) {
        if (mile < 3) {
            return 14;
        } else if (mile > 3 && mile < 10) {
            return 14 + (mile - 3) * 2;
        }
        return 14 + (mile - 3) * 2 + (mile - 10) * 3;
    }
}
