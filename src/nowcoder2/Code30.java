package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 11:41
 */
public class Code30 {
    public static void main(String[] args) {
//        int[] array={6,-3,-2,7,-15,1,2,2};
        Code30 code30=new Code30();
//        int[] array={1,-2,3,10,-4,7,2,-5};
        int[] array={-2,-8,-1,-5,-9};
        System.out.println(code30.FindGreatestSumOfSubArray(array));
    }

    public int FindGreatestSumOfSubArray(int[] array) {
        if (array==null){
            return 0;
        }
        int max=array[0];
        int sum=array[0];
        for (int i = 1; i < array.length; i++) {
            sum=sum+array[i];
            if (sum>max){
                max=sum;
            }
            if (array[i]>max){
                max=array[i];
                sum=array[i];
            }
        }
        return max;
    }
}
