//所有 DNA 都由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究
//非常有帮助。 
//
// 编写一个函数来查找目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。 
//
// 
//
// 示例： 
//
// 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//输出：["AAAAACCCCC", "CCCCCAAAAA"] 
// Related Topics 位运算 哈希表


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Java：重复的DNA序列
public class P187RepeatedDnaSequences {
    public static void main(String[] args) {
        Solution solution = new P187RepeatedDnaSequences().new Solution();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List list = solution.findRepeatedDnaSequences(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> findRepeatedDnaSequences(String s) {
            if (s == null || s.length() < 10) {
                return new ArrayList();
            }
            int L = 10;
            HashSet set = new HashSet();
            HashSet set2 = new HashSet();
            for (int i = 0; i < s.length() - L + 1; i++) {
                String s1 = s.substring(i, i + L);
                if (set.contains(s1)) set2.add(s1);
                set.add(s1);
            }
            return new ArrayList<>(set2);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}