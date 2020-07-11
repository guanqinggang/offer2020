package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/27 22:13
 */
public class Code14 {
    public static void main(String[] args) {
        Code14 code14=new Code14();
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        ListNode listNode= code14.FindKthToTail(l1,0);
        System.out.println(listNode.val);
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head==null||k==0){
            return null;
        }
        ListNode slow =head;
        ListNode fast =head;
        for (int l = 0; l < k-1; l++) {
            if (fast.next!=null){
                fast=fast.next;
            }else{
                return null;
            }
        }

        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }

        return slow;
    }
    int i=0;
    int j=0;
    public ListNode FindKthToTail2(ListNode head,int k) {
        if (head==null||k==0){
            return null;
        }
          j++;
          ListNode node =head;
          if (node.next==null){
              i=1;
              return node;
          }
          ListNode childNode= FindKthToTail(node.next, k);
           if (k>j){
               return null;
           }
           if (i>=k){
               return childNode;
            }else{
               i++;
               return node ;
            }
  }
}
