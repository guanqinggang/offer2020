package nowcoder;
import java.util.ArrayList;
/**
 * @author guanqinggang
 * @date 2020/5/28 21:32
 */

public class Code19 {
    public static void main(String[] args) {
        //int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        //[[1],[2],[3],[4],[5]]
        int[][] array={{1},{2},{3},{4},{5}};
        Code19 code19=new Code19();
        System.out.println( code19.printMatrix(array));
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList list =new ArrayList();
            if (matrix==null) {
                return list;
            }
           int rows=matrix.length-1;  //行
           int cols=matrix[0].length-1;  //列
           int rowstart=0;
           int colstart=0;
           int col=0;
           int row=0;
           while (rowstart<=cols&&colstart<=rows){
               for (; col <=cols ; col++) {
                   list.add(matrix[row][col]);
                   System.out.println(matrix[row][col]);
               }
               col--;
               row++;
               for (;row <= rows ; row++) {
                   list.add(matrix[row][col]);
                  System.out.println(matrix[row][col]);
               }
               row--;
               col--;
               for (; col>=colstart ;col--) {
                   list.add(matrix[row][col]);
                   System.out.println(matrix[row][col]);
               }
               col++;
               row--;
               for (; row>rowstart ;row--) {
                   list.add(matrix[row][col]);
                   System.out.println(matrix[row][col]);
               }
               row++;
               col++;
               rows--;
               cols--;
               rowstart++;
               colstart++;
           }
           return list;
    }
}
