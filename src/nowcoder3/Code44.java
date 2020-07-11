package nowcoder3;

/**
 * @author guanqinggang
 * @date 2020/6/4 21:37
 */
public class Code44 {
    public static void main(String[] args) {
         Code44 code44=new Code44();
         String x= code44.LeftRotateString("abcXYZdef",10);
         System.out.println(x);
    }
    public String LeftRotateString(String str,int n) {
          if (str==null||" ".equals(str)){
              return "";
          }
          if (n<0||n>str.length()){
              return "";
          }
          StringBuilder sb=new StringBuilder(str);
          Reverse(sb,0,n-1);
          Reverse(sb,n,sb.length()-1);
          Reverse(sb,0,sb.length()-1);
          return sb.toString();
    }
    public StringBuilder Reverse(StringBuilder sb,int left,int right){
        //StringBuilder sb=new StringBuilder(str);
//        int left =0;
//        int right=sb.length()-1;
        while (left<right){
            char r=sb.charAt(right);
            char l=sb.charAt(left);
            sb.setCharAt(left,r);
            sb.setCharAt(right,l);
            left++;
            right--;
        }
        return sb;
    }
}
