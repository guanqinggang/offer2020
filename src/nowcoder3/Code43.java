package nowcoder3;

import java.util.ArrayList;

/**
 * @author guanqinggang
 * @date 2020/6/4 20:14
 */
public class Code43 {
    // 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
    // 如果有多对数字的和等于S，输出两个数的乘积最小的。
    public static void main(String[] args) {
            Code43 code43=new Code43();
            //1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20],21
            int[] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
            ArrayList list=code43.FindNumbersWithSum(array,21);
            System.out.println(list.get(0));
            System.out.println(list.get(1));
    }
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
           ArrayList arrayList=new ArrayList();
           if (array==null){
               return arrayList;
           }
           int left=0;
           int rigth=array.length-1;
           int curSum=0;
           int ji=0;
           while (left<rigth){
               curSum=array[left]+array[rigth];
               if(sum==curSum){
                   if (ji==0){
                       arrayList.add(array[left]);
                       arrayList.add(array[rigth]);
                       ji=array[left]*array[rigth];
                       rigth--;
                    }else if(array[left]*array[rigth]<ji){
                       ji=array[left]*array[rigth];
                       arrayList.set(0,array[left]);
                       arrayList.set(1,array[rigth]);
                   }
                   rigth--;
               }else if(curSum<sum){
                    left++;
               }else {
                   rigth--;
               }
           }
            return arrayList;
    }
}
