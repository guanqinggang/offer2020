package nowcoder3;

/**
 * @author guanqinggang
 * @date 2020/6/4 21:37
 */
public class Code45 {
    public static void main(String[] args) {
         Code45 code45=new Code45();
         String str= code45.ReverseSentence("student. a am I");
         System.out.println(str);
    }

    public String ReverseSentence(String str) {
        if(str==null||" ".equals(str)){
            return null;
        }

        StringBuilder sb=new StringBuilder(str);
        Reverse(sb,0,str.length()-1);
        int left =0;
        int right=0;
        while (left<sb.length()){
            if (sb.charAt(left)==' '){
                left++;
                right++;
            }else if(right==sb.length()||sb.charAt(right)==' '){
                Reverse(sb,left,--right);
                left=++right;
            }else{
                right++;
            }

        }
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
