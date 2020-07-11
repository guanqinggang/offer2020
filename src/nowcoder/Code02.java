package nowcoder;

/**
 * @author guanqinggang
 * @date 2020/5/23 15:37
 */
public class Code02 {

    public static void main(String[] args) {
        Code02 code02=new Code02();
        StringBuffer sb=new StringBuffer("");
        System.out.println(code02.replaceSpace(sb));
        ;
    }
    //We Are Happy
    public String replaceSpace(StringBuffer str) {
        if (str==null||str.length()==0){
            return "";
        }
        int oldlen=str.length();
        int editlen=0;
        for (int i = 0; i < oldlen; i++) {
            if (str.charAt(i)==' '){
                editlen++;
            }
        }
        int newlen=oldlen+editlen*2;
        str.setLength(newlen);
        int i=oldlen-1;
        int j=newlen-1;
        while (i>=0&&i<j){
            if (str.charAt(i)==' '){
                str.setCharAt(j--,'0');
                str.setCharAt(j--,'2');
                str.setCharAt(j--,'%');
            }else {
                str.setCharAt(j--,str.charAt(i));
            }
            i--;
        }
        return   str.toString();
    }
}
