package responsibilityChain;

/**
 * 角色：老板
 * <p>
 * 请假天数小于等于10天，可以直接审批
 * 大于10天，直接拒绝
 *
 * @author naiqing.lin
 * @date 3/26/19 11:11 AM
 */

public class BossHandler extends Handler {
    @Override
    void deal(int val) {
        if (val <= 10) {
            System.out.println("boss: 批准");
            return;
        }
        System.out.println("不批准");
    }
}