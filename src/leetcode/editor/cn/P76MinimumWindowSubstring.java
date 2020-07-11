//给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。 
//
// 示例： 
//
// 输入: S = "ADOBECODEBANC", T = "ABC"
//输出: "BANC" 
//
// 说明： 
//
// 
// 如果 S 中不存这样的子串，则返回空字符串 ""。 
// 如果 S 中存在这样的子串，我们保证它是唯一的答案。 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//Java：最小覆盖子串
public class P76MinimumWindowSubstring {
    public static void main(String[] args) {
        Solution solution = new P76MinimumWindowSubstring().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String minWindow(String s, String t) {
            //HashMap<Character, Integer> map = new HashMap();
            Queue<Character> queue = new LinkedBlockingQueue();
            HashSet set = new HashSet();
            int left = 0;
            int tlen = t.length();
            int min = 0;
            String minStr = null;
            int i = 0;
            while (i<s.length()) {
                if (set.size() < tlen) {
                    queue.add(s.charAt(i));
                    set.add(s.charAt(i++));
                } else {
                    if (min > queue.size()) {
                        minStr = new String(queue.toString());  // 问题
                    }
                    Character ss = queue.poll();
                    set.remove(ss);
                }

            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}