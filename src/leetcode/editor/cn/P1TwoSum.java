//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


package leetcode.editor.cn;

import java.util.HashMap;

//Java：两数之和
public class P1TwoSum {
    public static void main(String[] args) {
        Solution solution = new P1TwoSum().new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] res = solution.twoSum2(nums, 18);
        System.out.println(res[0] + "," + res[1]);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap();
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int num = target - nums[i];
                if (map.containsKey(num) && map.get(num) != i) {
                    res[1] = i;
                    res[0] = map.get(num);
                    return res;
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }

        public int[] twoSum2(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}