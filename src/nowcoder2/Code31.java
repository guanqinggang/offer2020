package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 12:15
 */
public class Code31 {
    public static void main(String[] args) {
        Code31 code31=new Code31();
        System.out.println(code31.NumberOf1Between1AndN_Solution(5));

    }
    public int NumberOf1Between1AndN_Solution(int n) {
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=NumberOf1Between1AndN_Solution2(i);
        }
        return sum;
    }
    public int NumberOf1Between1AndN_Solution2(int n) {
           int count=0;
           while (n!=0){
               if(n%10==1){
                   count++;
               }
               n=n/10;
           }
            return count;
    }
}
