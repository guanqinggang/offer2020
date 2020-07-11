//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 示例 1: 
//
// 输入: ["flower","flow","flight"]
//输出: "fl"
// 
//
// 示例 2: 
//
// 输入: ["dog","racecar","car"]
//输出: ""
//解释: 输入不存在公共前缀。
// 
//
// 说明: 
//
// 所有输入只包含小写字母 a-z 。 
// Related Topics 字符串


package leetcode.editor.cn;

//Java：最长公共前缀
public class P14LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] strs={"flower","flow","flight"};
        String[] strs2 = {"c", "c"};
        Solution solution = new P14LongestCommonPrefix().new Solution();
        String str = solution.longestCommonPrefix(strs2);
        System.out.println(str);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs == null || strs.length == 0 || strs[0].equals("")) {
                return "";
            }
            StringBuilder sb = new StringBuilder("");
            outer:
            for (int i = 0; i < strs.length; i++) {
                char s = ' ';
                for (int j = 0; j < strs.length; j++) {
                    if (j == 0) {
                        s = strs[j].charAt(i);
                    } else {
                        if (s != strs[j].charAt(i)) {
                            break outer;
                        }
                    }
                }
                sb.append(strs[0].charAt(i));
            }
            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}