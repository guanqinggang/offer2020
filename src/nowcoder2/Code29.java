package nowcoder2;

import java.util.ArrayList;

/**
 * @author guanqinggang
 * @date 2020/5/31 20:50
 */
public class Code29 {

    public static void main(String[] args) {
        int[] input={2,2,2,2,2,2,2,2,2};
        int k=4;
        Code29 code29=new Code29();
        code29.GetLeastNumbers_Solution(input, 4);

    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list=new ArrayList();
        if (input==null){
            return list;
        }
        if (k<0||k>input.length){
            return list;
        }
        input=quickSort( input,0,input.length-1, k);
        for (int i = 0; i <k ; i++) {
            System.out.println(input[i]);
            list.add(input[i]);
        }
        return list;
    }

    public  int[] quickSort(int [] input,int left,int right, int k) {
        if (input==null){
            return null;
        }
        if (left>=right){
            return input;
        }
        int index=input[left];
        int i=left;
        int j=right;
        while (i<j){
            while (i<j&&index<input[j]){
                j--;
            }
            while (i<j&&index>=input[i]){
                i++;
            }

            int tmp=input[i];
            input[i]=input[j];
            input[j]=tmp;
        }
        input[left]=input[i];
        input[i]=index;

        if (i<k){
            input=quickSort(input, i+1, right, k);
        }else if(i>k){
            input=quickSort(input, left, i-1, k);
        }
        return input;
    }
}
