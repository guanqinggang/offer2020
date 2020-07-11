package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/5/30 19:18
 */
public class Code28 {

    public static void main(String[] args) {
//        int[] a={1,2,3,2,2,2,5,4,2};
        int[] a={1,2,3,5,4,2};
        Code28 code28=new Code28();
        int m= code28.MoreThanHalfNum_Solution(a);
        System.out.println(m);
    }
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null){
            return 0;
        }
        int result=array[0];
        int times=1;
        for (int i = 1; i <array.length ; i++) {
            if (times==0){
                times=1;
                result=array[i];
            }else if (array[i]==result){
                times++;
            }else {
                times--;
            }
        }
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==result){
                count++;
            }
        }
        if (count*2<=array.length){
            return 0;
        }
        return result;
    }
}
