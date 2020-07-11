package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/25 22:08
 */
public class Code09 {
    public static void main(String[] args) {
        Code09 code09 = new Code09();
        for (int i = 1; i < 5; i++) {
            System.out.println(code09.JumpFloorII(i));
        }
    }

    public int JumpFloorII(int target) {
      //f(n)=2f(n-1)   1 2 4 8
        if (target<=0){
            return 0;
        }else if(target==1){
            return 1;
        }
        int result=1;
        for (int i = 1; i <target ; i++) {
            result=2*result;
        }

        return result;
    }
}
