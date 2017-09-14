package designPattern.decorate.test1;

/**
 * Created by Linnq on 2017/8/31.
 */

/**
 * 编程题目：
 出租车起步价14元，含3公里
 起步价之后，每公里2.5元
 晚上11点之后（含），次日6点前（不含）起步价18元，含3公里
 晚上起步价之后，每公里3元
 10公里之后，白天每公里3.5元，晚上每公里4.7元
 外环的出租车10公里之外的价格与10公里之内相同

 请编写代码表示出上述的功能
 要求：
 1. 体现出良好的设计，使得代码具有一定的灵活性和扩展性
 2. 提供测试代码
 */


/**
 * 基于 装饰者 模式设计
 */
public class Test {
    public static void main(String args[]){
        Price p = new SHDayCostPrice(new DayCostPrice(new BaseCostPrice()));
        System.out.println(p.calPrice(4));
    }

}
