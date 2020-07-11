package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 18:42
 */
public class Code35 {
    public static void main(String[] args) {
        Code35 code35=new Code35();
        int[] array={1,2,3,5,4,6,7,0};
       // int[] array={1,1,1,1,1};
        int left=0;
        int right=array.length-1;
        int[] copy=new int[array.length];
        int x=code35.InversePairs(array);
        System.out.println(x+"...............");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public int InversePairs(int [] array ){
        if (array==null){
            return 0;
        }
        int left=0;
        int right=array.length-1;
        int[] copy=new int[array.length];
        int x=InversePairs(array,copy,left,right,0);
        x=x%1000000007;
        return x;
    }

    public int InversePairs(int [] array ,int[] copy,int left,int right ,int count) {
        if (left==right){
            return count;
        }
        int mid=(left+right)>>1;
        count=InversePairs( array ,copy,left,mid,count);
        count=InversePairs( array ,copy,mid+1,right,count);
        count=reduce(array,copy,left,mid,right,count);
        return count;
    }
    public int reduce(int [] array,int[] copy,int left,int mid,int right,int count) {
        int i=left;
        int j=mid+1;
        int k=left;
        while (i<=mid&&j<=right){
            if (array[i]>array[j]){
                copy[k++]=array[j++];
                count=count+(mid+1-i);
            }else {
                copy[k++]=array[i++];

            }
        }
        while (i<=mid){
            copy[k++]=array[i++];
        }
        while (j<=right){
            copy[k++]=array[j++];
        }
        for (int l = left; l <=right ; l++) {
            array[l]=copy[l];
        }
        return count;
    }
}
