package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/28 9:54
 */
public class Code16 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(4);
        ListNode l4=new ListNode(5);
        ListNode l5=new ListNode(6);
        l1.next=l3;
        l2.next=l4;
        l4.next=l5;
        Code16 code16=new Code16();
       ListNode li= code16.Merge(l1,l2);
       System.gc();
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode node;
        ListNode childNode;
        if (list1.val>list2.val){
            node=list2;
            childNode= Merge(list1, node.next);
         }else {
            node=list1;
            childNode= Merge(list2, node.next);
        }
        node.next=childNode;
        return node;
    }
    public ListNode Merge2(ListNode list1,ListNode list2) {
            if (list1==null){
                return list2;
            }
            if (list2==null){
                return list1;
            }
            while (list1.next!=null){
                while (list1.next.val>list2.val){
                    ListNode list2next= list2.next;
                    list2.next=list1.next;
                    list1.next=list2;
                    list2=list2next;
                }
                list1=list1.next;
            }
            return null;
    }
}
