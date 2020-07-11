package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/2 17:14
 */
public class Code38 {
    public static void main(String[] args) {

        Code38 code38=new Code38();
        int[] array={3};
        System.out.println( code38.GetNumberOfK(array,3));

    }
    public int GetNumberOfK(int [] array , int k) {
           if (array==null){
               return 0;
           }
           int left=0;
           int right=array.length-1;
           int mid=(left+right)>>1;
           while (left<right){
               if (array[mid]>k){
                   right=mid-1;
                   mid=(left+right)>>1;
               }else if(array[mid]<k){
                   left=mid+1;
                   mid=(left+right)>>1;
               }else{
                   break;
               }
           }
           int hit=mid;
           int count=0;
           while (hit>=0&&hit<array.length&&array[hit]==k){
               count++;
               hit++;
           }
           mid--;
           while (mid>=0&&mid<array.length&&array[mid]==k){
                count++;
                mid--;
           }
           return count;
    }
}
