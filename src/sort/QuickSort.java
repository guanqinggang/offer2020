package sort;

/**
 * @author guanqinggang
 * @date 2020/5/31 16:06
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a={4,5,1,6,2,7,3,8};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(a,0,a.length-1);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
        System.out.println("111111111111111111");
    }

    public int[] sort(int[] array,int left,int right){
        if (array==null){
            return null;
        }
        if (left>=right){
            return array;
        }
        int index=array[left];
        int i=left;
        int j=right;
        while (i<j){
            while (i<j&&array[j]>=index){
                j--;
            }
            while (i<j&&
                array[i]<=index){
                i++;
            }
            int tmp=array[i];
            array[i]=array[j];
            array[j]=tmp;
        }
        array[left]=array[i];
        array[i]=index;

        array=sort(array,left,i);
        array=sort(array,i+1,right);
        return array;
    }
}
