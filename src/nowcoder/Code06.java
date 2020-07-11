package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/23 18:33
 */
//{3,4,5,1,2}为{1,2,3,4,5}
public class Code06 {

    public static void main(String[] args) {
        int[] arrray={3,4,5,1,2};
        Code06 code06=new Code06();
        int a= code06.minNumberInRotateArray(arrray);
        System.out.println(a);
    }
    public int minNumberInRotateArray(int [] array) {
        minNumberInRotateArrayLisp(array, 0, array.length-1);
        return 0;
    }
    public int minNumberInRotateArrayLisp(int [] array,int start,int end) {
        int mid=(start+end)/2;
        if (array[mid]>=array[start]){
            start=mid;
        }else if(array[mid]<=array[end]){
            end=mid;
        }else{
            if (mid==start+1){
                return array[start];
            }
            if (mid==end-1){
                return 0;
            }
        }
        return 0;
    }
}
