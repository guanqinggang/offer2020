package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/25 22:57
 */
public class Code11 {
    public static void main(String[] args) {
        Code11 code11=new Code11();
        System.out.println(code11.NumberOf1(4)); ;
    }
    //输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    public int NumberOf1(int n) {
        int count =0;
        while (n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public int NumberOf1_2(int n) {
        int count=0;
        int flag=1;
        while (flag!=0){
            int a=n&flag;
            if(a!=0){
                count++;
            }
            flag=flag<<1;
        }
        return count;
    }
}
