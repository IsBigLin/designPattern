package decorate.test1;

/**
 * Created by Linnq on 2017/8/31.
 */
public class DayCostPrice extends Price {
    private   int base_price = 0;
    private  int three_cost = 1;  //三公里内的价格 增加一块
    private  int ten_cost = 0;
    private Price price;

    public DayCostPrice(Price price) {
        this.price = price;
    }

    @Override
    public int calPrice(int mile) {
        int result = 0;
            if (mile < 3) {
                result = base_price;
            } else if (mile > 3 && mile < 10) {
                result = base_price + (mile - 3) * three_cost;
            }else if(mile > 10){
                result = base_price + (mile - 3) * three_cost + (mile - 10) * ten_cost;
            }
        return price.calPrice(mile) + result;
    }
}
