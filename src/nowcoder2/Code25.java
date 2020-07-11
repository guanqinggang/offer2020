package nowcoder2;

import java.util.HashMap;

/**
 * @author guanqinggang
 * @date 2020/5/30 11:18
 */
public class Code25 {
    public static void main(String[] args) {

    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead==null){
            return null;
        }
        RandomListNode node=pHead;
        RandomListNode copyHead=new RandomListNode(node.label);
        RandomListNode returnHead=copyHead;
        RandomListNode copyHead2=copyHead;
        HashMap<RandomListNode,RandomListNode> map= new HashMap();
        while (node.next!=null){
            RandomListNode copyNextNode=new RandomListNode(node.next.label);
            map.put(node.next,copyNextNode);
            copyHead.next=copyNextNode;
            node=node.next;
            copyHead=copyNextNode;
        }
        RandomListNode node2=pHead;
        while (node2.next!=null) {
            copyHead2.random=map.get(node2.random);
            node2= node2.next;
            copyHead2=copyHead2.next;
        }
        return returnHead;
    }
}
