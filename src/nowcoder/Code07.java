package nowcoder;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author guanqinggang
 * @date 2020/5/23 22:01
 */
public class Code07 {
    public static void main(String[] args) {
        Code07 code07=new Code07();
        for (int i = 0; i < 39; i++) {
            System.out.println( code07.Fibonacci(i));
        }

    }
    public int Fibonacci(int n) {
        //0 1,1,2,3,5,8
        int result=0;
        if (n==1){   //0 1 1 2
             result=1;
             return result;
        } // i=1   0  1  i=2  1,1 2
        //
       int prex=0;
       int prex2=1;
       for (int i = 1; i < n; i++) {
            result=prex+prex2;
            prex=prex2;
            prex2=result;
        }
       return result;
    }

}
