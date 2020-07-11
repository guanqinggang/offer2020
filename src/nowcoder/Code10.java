package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/25 22:47
 */
public class Code10 {
    public static void main(String[] args) {
        Code10 code10=new Code10();
       System.out.println(code10.RectCover(0)); ;
    }
    public int RectCover(int target) {
        if (target<=0){
            return 0;
        }
        if (target==1){
            return 1;
        }else if(target==2){
            return 2;
        }
        int res=RectCover(target-1)+RectCover(target-2);
        return res;
    }
}
