/**
 * Created by nadimchouglay on 12/07/2017.
 */
public class Assignment8 {
    public static int sumUnique(int a,int b,int c){
        if(a==b&& b==c) return 0;
        if (a==b) return c;
        if (a==c) return b;
        if (b==c)return a;
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sumUnique(1,2,3));
        System.out.println(sumUnique(3,2,3));
        System.out.println(sumUnique(3,3,3));
    }
}
