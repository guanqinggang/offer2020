package nowcoder2;

import java.util.HashMap;

/**
 * @author guanqinggang
 * @date 2020/6/1 14:39
 */
public class Code34 {
    public static void main(String[] args) {
        String str="";
        Code34 code34=new Code34();
        System.out.println( code34.FirstNotRepeatingChar(str));
    }
    public int FirstNotRepeatingChar(String str) {
        if (str==null){
            return -1;
        }
        HashMap<Character,Integer> hashMap=new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char s=str.charAt(i);
            if (hashMap.get(s)==null){
                hashMap.put(s,1);
            }else {
                hashMap.put(s,hashMap.get(s)+1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
