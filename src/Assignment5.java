/**
 * Created by nadimchouglay on 12/07/2017.
 */
public class Assignment5 {
    public static boolean isCool(int n){
        return n% 11 ==0||n%11 ==1;

    }

    public static void main(String[] args) {
        System.out.println(isCool(22));
        System.out.println(isCool(23));
        System.out.println(isCool(24));
    }
}
