package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 13:19
 */
public class Code33 {
    public static void main(String[] args) {

        Code33 code33=new Code33();
        int x= code33.GetUglyNumber_Solution(1200);
        System.out.println(x);
        //
    }

    public int GetUglyNumber_Solution(int index) {
        if (index<=0){
            return 0;
        }
        int num=0;
        int ugly=0;
        while (ugly<index){
            num++;
            if(isUgly(num)){
                ugly++;
            }
        }
        return num;
    }

    public boolean isUgly(int x){
        while (x%2==0){
            x=x/2;
        }
        while (x%3==0){
            x=x/3;
        }
        while (x%5==0){
            x=x/5;
        }
        return x==1?true:false;
    }
}
