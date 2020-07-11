//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学


package leetcode.editor.cn;

//Java：两数相加
public class P2AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new P2AddTwoNumbers().new Solution();
        // solution.addTwoNumbers();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode listNode = new ListNode(0);
            ListNode li = listNode;
            int wei = 0;
            while (l1 != null || l2 != null) {
                int x = l1 != null ? l1.val : 0;
                int y = l2 != null ? l2.val : 0;
                int val = x + y + wei;
                wei = val / 10;
                listNode.next = new ListNode(val % 10);
                listNode = listNode.next;
                if (l1.next != null) l1 = l1.next;
                if (l2.next != null) l2 = l2.next;
            }
            if (wei != 0) {
                listNode.next = new ListNode(1);
            }
            return li.next;
        }

        /**
         * 解法2
         *
         * @param l1
         * @param l2
         * @return
         */
        public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
            ListNode listNode = new ListNode(0);
            ListNode p1, p2, curr;
            p1 = l1;
            p2 = l2;
            curr = listNode;
            int sum = 0;
            while (p1 != null || p2 != null) {
                sum = sum / 10;
                if (p1 != null) {
                    sum += p1.val;
                    p1 = p1.next;
                }
                if (p2 != null) {
                    sum += p2.val;
                    p2 = p2.next;
                }
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
            }
            if (sum / 10 == 1) {
                curr.next = new ListNode(1);
            }
            return listNode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}