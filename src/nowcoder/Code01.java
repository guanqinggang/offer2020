package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/23 15:11
 */
public class Code01 {
    public static void main(String[] args) {
       int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
       Code01 code01=new Code01();
       System.out.println( code01.Find(13,array));
    }
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0){
            return false;
        }
        int row=array.length-1;
        int col=array[0].length-1;
        int i=0;
        int j=col;
        while (i<=row&&j>=0){
            if (target<array[i][j]){
                j--;
            }else if(target>array[i][j]){
                i++;
            }else {
                return true;
            }
        }
       return false;
    }
}
