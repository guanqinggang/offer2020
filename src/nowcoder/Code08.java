package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/25 21:27
 */
public class Code08 {
    public static void main(String[] args) {
        Code08 code08=new Code08();
        for (int i = 1; i < 10; i++) {
            System.out.println(  code08.JumpFloor(i));
        }

    }
    public int JumpFloor(int target) {
        // 1,2,3,5,8
        if (target==1){
            return 1;
        }else if (target==2){
            return 2;
        }

        int one =1;
        int two=2;
        int result=0;
        for (int i = 2; i < target; i++) {
            result =one+two;
            one=two;
            two=result;
        }
        return result;
    }
    public int JumpFloor2(int target) {
        // 1,2,3,5,8
        if (target==1){
            return 1;
        }else if (target==2){
            return 2;
        }
        int result= JumpFloor(target-1)+JumpFloor(target-2);
        return result;
    }
}
