package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/26 14:53
 */
public class Code12 {
    public static void main(String[] args) {
        Code12 code12=new Code12();
        System.out.println(code12.Power(2,4));
        System.out.println(code12.Power(2,4));
    }
    public double Power(double base, int exponent) {
        if (base==0){
            return 0;
        }
        int absExponent=exponent;
        if (exponent<0){
            absExponent=-exponent;
        }
        double result=calc(base,absExponent);
        if(exponent<0){
            result=1/result;
        }
        return result;
    }
    public double calc(double base, int exponent){
        if (exponent==0){
            return 1;
        }else if(exponent==1){
            return base;
        }
        double ret=1;
         ret=calc( base, exponent>>1);
         ret=ret*ret;
         if ((exponent&1)==1){
             ret =ret*base;
         }
         return ret;
    }
    public double calc2(double base, int exponent){
        double ret=1;
        for (int i = 0; i <exponent ; i++) {
            ret =ret*base;
        }
        return ret;
    }
}
