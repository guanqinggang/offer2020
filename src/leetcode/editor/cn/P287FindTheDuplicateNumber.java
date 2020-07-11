//给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出
//这个重复的数。 
//
// 示例 1: 
//
// 输入: [1,3,4,2,2]
//输出: 2
// 
//
// 示例 2: 
//
// 输入: [3,1,3,4,2]
//输出: 3
// 
//
// 说明： 
//
// 
// 不能更改原数组（假设数组是只读的）。 
// 只能使用额外的 O(1) 的空间。 
// 时间复杂度小于 O(n2) 。 
// 数组中只有一个重复的数字，但它可能不止重复出现一次。 
// 
// Related Topics 数组 双指针 二分查找


package leetcode.editor.cn;
//Java：寻找重复数
public class P287FindTheDuplicateNumber{
    public static void main(String[] args) {
        Solution solution = new P287FindTheDuplicateNumber().new Solution();
        int[] nums={1,3,4,2,2};   // [1,3,4,2,2]

        System.out.println(solution.findDuplicate(nums));
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //输入: [3,1,3,4,2]
    //输出: 3
class Solution {
        public int findDuplicate(int[] nums) {
            int s1=nums[0];
            int s2=nums[nums[0]];
            while (s1!=s2){
                s1=nums[s1];
                s2=nums[nums[s2]];
            }
            s1=0;
            while (s1!=s2){
                s1=nums[s1];
                s2=nums[s2];
            }
            return s1;
        }
    public int findDuplicate2(int[] nums) {
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        while (start < end) {
            int mid = (start + end) >> 1;
            int cnt = 0;
            for (int i = 0; i < length ; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt > mid) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
        public int findDuplicate3(int[] nums) {
            int len = nums.length;
            int left = 1;
            int right = len - 1;
            while (left < right) {
                // 在 Java 里可以这么用，当 left + right 溢出的时候，无符号右移保证结果依然正确
                int mid = (left + right) >>> 1;

                int cnt = 0;
                for (int num : nums) {
                    if (num <= mid) {
                        cnt += 1;
                    }
                }

                // 根据抽屉原理，小于等于 4 的个数如果严格大于 4 个
                // 此时重复元素一定出现在 [1, 4] 区间里
                if (cnt > mid) {
                    // 重复元素位于区间 [left, mid]
                    right = mid;
                } else {
                    // if 分析正确了以后，else 搜索的区间就是 if 的反面
                    // [mid + 1, right]
                    left = mid + 1;
                }
            }
            return left;
        }

}
//leetcode submit region end(Prohibit modification and deletion)


}