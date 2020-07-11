//给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法


package leetcode.editor.cn;

import java.util.*;

//Java：全排列
public class P46Permutations {
    public static void main(String[] args) {
        Solution solution = new P46Permutations().new Solution();
        int nums[]={1,2,3};
        List list=solution.permute(nums);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            int len = nums.length;
            List<List<Integer>> res = new ArrayList<>();
            if (len == 0) {
                return res;
            }
            Deque<Integer> path = new ArrayDeque<Integer>();
            boolean[] used = new boolean[nums.length];
            allRank(nums, len, 0, res, path, used);
            return res;
        }

        private void allRank(int[] nums, int len, int depth, List<List<Integer>> res, Deque<Integer> path, boolean[] used) {
            if (len == depth) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = 0; i < len; i++) {
                if (used[i]){
                    continue;
                }
                path.add(nums[i]);
                used[i]=true;
                allRank(nums,len,depth+1,res,path,used);
                path.removeLast();
                used[i]=false;
            }

        }


    }


//leetcode submit region end(Prohibit modification and deletion)

}