package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 20:16
 */
public class Code36 {
    public static void main(String[] args) {
        Code36 code36=new Code36();
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        ListNode l6=new ListNode(7);
        ListNode l7=new ListNode(8);
        ListNode l8=new ListNode(9);
        l1.next=l3;
        l3.next=l6;
        l2.next=l4;
        l4.next=l5;
//        l5.next=l6;
//        l6.next=l7;
//        l7.next=l8;
        ListNode listNode=code36.FindFirstCommonNode(l1,l2);
        System.out.println(listNode.val);
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
             if (pHead1==null||pHead2==null){
                 return null;
             }
           ListNode ph1=pHead1;
           ListNode ph2=pHead2;
           int l1=1;
           int l2=1;
           while (ph1.next!=null){
               ph1=ph1.next;
               l1++;
           }
            while (ph2.next!=null){
                ph2=ph2.next;
                l2++;
            }
            int l=l1-l2;
            ListNode longNode;
            ListNode shortNode;
            if (l>0){
                longNode=pHead1;
                shortNode=pHead2;
            }else {
                l=-l;
                longNode=pHead2;
                shortNode=pHead1;
            }
            for (int i = 0; i < l ; i++) {
                longNode=longNode.next;
            }
            while (longNode!=null&&shortNode!=null&&!(longNode.val==shortNode.val&&longNode.next==shortNode.next)){
                longNode=longNode.next;
                shortNode=shortNode.next;
            }
            return shortNode;
    }
}
