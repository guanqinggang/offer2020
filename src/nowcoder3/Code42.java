package nowcoder3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guanqinggang
 * @date 2020/6/3 22:37
 */
public class Code42 {
    public static void main(String[] args) {
        Code42 code42=new Code42();
        List list=code42.FindContinuousSequence(15);
        System.out.println("");
    }
    //输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
            ArrayList arrayList=new ArrayList();
            if (sum<3){
                return arrayList;
            }
            int mid=(1+sum)/2;
            int left =1;
            int right=2;
            int curSum=left+right;
            while (left<mid){
                if (curSum==sum){
                    addList(arrayList, left, right);
                }
                while (curSum>sum&&left<mid){
                   curSum=curSum-left;
                    left++;
                   if (curSum==sum){
                       addList(arrayList, left, right);
                   }
                }
                right++;
                curSum=curSum+right;
           }
        return arrayList;
    }
    public void addList(ArrayList list,int left,int right){
        ArrayList arrayList2=new ArrayList();
        for (int i = left; i <= right; i++) {
            arrayList2.add(i);
        }
        list.add(arrayList2);
    }
}
