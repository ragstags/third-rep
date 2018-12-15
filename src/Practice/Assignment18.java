package Practice;

/**
 * Created by nadimchouglay on 21/08/2017.
 */
public class Assignment18 {
    public static boolean twosumone(int a, int b, int c){
        return(a+b==c)||(b+c==a)||(a+c==b);
    }

    public static void main(String[] args) {
        System.out.println( twosumone(1,2,3)
        );
        System.out.println(twosumone(3,1,2));
        System.out.println(twosumone(3,2,2));
    }

    
}
