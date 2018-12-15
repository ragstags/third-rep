package Practice;

/**
 * Created by nadimchouglay on 25/08/2017.
 */
public class Assignment23 {
    public static int sumUnique(int a,int b,int c){
        if (a==b && b==c) return 0;
        if (a==b) return c;
        if (b==c)return a;
        if (a==c)return b;
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sumUnique(1,2,3));
        System.out.println(sumUnique(3,2,3));
        System.out.println(sumUnique(3,3,3));
    }
}
