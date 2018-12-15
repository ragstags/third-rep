/**
 * Created by nadimchouglay on 10/07/2017.
 */
public class Assignment2 {
    public static boolean twosumone(int a ,int b,int c){
        return (a+b==c) ||(a+c==b)||(b+c==a);
    }

    public static void main(String[] args) {
        System.out.println(twosumone(1,2,3));
        System.out.println(twosumone(3,1,2
        ));
        System.out.println(twosumone(3,2,2));
    }
}
