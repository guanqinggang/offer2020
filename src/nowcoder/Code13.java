package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/27 21:52
 */
public class Code13 {
    public static void main(String[] args) {
        Code13 code13=new Code13();
        int[] arrray={3,4,5,1,2};
        code13.reOrderArray(arrray);
    }

    public void reOrderArray(int [] array) {
        int j=0;
        for (int i = 0; i < array.length; i++) {

            if ((array[i]&1)==0){
                j=i+1;
                while ((array[j]&1)==0&&j<array.length){
                    j++;
                }
                if (j!=array.length){

                }

            }
        }
    }
    public void reOrderArray2(int [] array) {
        int len=array.length;
        int [] array2=new int[len];
        int j=0;
        for (int i = 0; i <len ; i++) {
            if ((array[i]&1)==1){
                array2[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i <len ; i++) {
            if ((array[i]&1)==0){
                array2[j]=array[i];
                j++;
            }
        }
        for (int i = 0; i <len ; i++) {
            array[i]=array2[i];
           // System.out.println(array[i]);
        }

    }
}
