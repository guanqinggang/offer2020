package nowcoder3;

/**
 * @author guanqinggang
 * @date 2020/6/2 19:45
 */
public class Code41 {
    //异或 是两数相同异或为0，两数不同异或为1
    public static void main(String[] args) {
            int[] arary={5,5,6,3,4,9,9,6};
            Code41 code41=new Code41();
            int num1[]=new int[1];
            int num2[]=new int[1];
        code41.FindNumsAppearOnce(null,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array==null){
            return;
        }
        int index=0;
        for (int i = 0; i < array.length; i++) {
            index=index^array[i];
        }
        int indexBit=FindFirstBitIs1(index);
        for (int i = 0; i < array.length; i++) {
           if (isBit(array[i],indexBit)){
               num1[0]=num1[0]^array[i];
           }else {
               num2[0]=num2[0]^array[i];
           }
        }



    }
    public int FindFirstBitIs1(int x){
        int count =0;
         while ((x&1)==0){
             x=x>>1;
             count++;
         }
        return count;
    }
    public boolean isBit(int index,int indexBit){
        index=index>>indexBit;
        return (index&1)==0;
    }


}
