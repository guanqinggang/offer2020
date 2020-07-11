package nowcoder2;

/**
 * @author guanqinggang
 * @date 2020/6/1 12:34
 */
public class Code32 {
    public static void main(String[] args) {
        int[] a={31};
        Code32 code32=new Code32();

        System.out.println( code32.PrintMinNumber(a));
    }

    public String PrintMinNumber(int [] numbers) {
        if (numbers==null){
            return "";
        }
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j =0; j < numbers.length-i-1 ; j++) {
                if (compare(numbers[j],numbers[j+1])){
                   int tmp= numbers[j];
                   numbers[j]=numbers[j+1];
                   numbers[j+1]=tmp;
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }
    public boolean compare(int a,int b){
        StringBuilder aa= new StringBuilder(a+"");
        StringBuilder bb= new StringBuilder(b+"");
        StringBuilder ab=aa.append(b);
        StringBuilder ba=bb.append(a);
        if (ab.toString().compareTo(ba.toString())>0){
            return true;
        }else {
            return false;
        }
    }

}
