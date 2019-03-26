package responsibilityChain;

/**
 * 角色：上级领导
 * <p>
 * 请假天数小于等于2天，可以直接审批
 * 大于2天，要boss审批
 *
 * @author naiqing.lin
 * @date 3/26/19 11:08 AM
 */

public class LeaderHandler extends Handler {
    @Override
    void deal(int val) {
        if (val <= 2) {
            System.out.println("leader: 批准");
            return;
        }
        System.out.println("需要boss审批");
        getNext().deal(val);
    }
}
