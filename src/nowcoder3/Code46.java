package nowcoder3;

/**
 * @author guanqinggang
 * @date 2020/6/4 21:37
 */
public class Code46 {
    public static void main(String[] args) {
        Code46 code46=new Code46();
        int[] num={3,2,4,0,7};

       // code46.sort(num);
        System.out.println(code46.isContinuous(num));
        for (int i = 0; i <num.length ; i++) {
            System.out.println(num[i]);
        }
    }
    public boolean isContinuous(int [] numbers) {
        if (numbers==null||numbers.length==0){
            return false;
        }
        sort(numbers);
        int count0=0;
        for (int i = 0; numbers[i]==0&&i<numbers.length; i++) {
            count0++;
        }
        //System.out.println("::"+count0);
        int small=count0;
        int countStrp=0;
        int big=small+1;
        while (big<numbers.length){
            if (numbers[small]==numbers[small+1]){
                return false;
            }
            countStrp+=(numbers[big]-numbers[small]-1);
            if (countStrp>count0){
                return false;
            }
            small=big;
            big++;
        }

        return true;
    }
    public void sort(int[] nums){
        for (int i = 0; i <  nums.length-1; i++) {
            for (int j = 0; j <  nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]){
                    int tmp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=tmp;
                }
            }
        }
    }
}
