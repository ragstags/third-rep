package Practice;

/**
 * Created by nadimchouglay on 12/07/2017.
 */
public class Assignment {
    public static boolean isordered(int first, int second, int third, boolean itsok) {
        return (itsok)?(second<third):(first<second)&&(second<third)&&(first<third);
    }

    public static void main(String[] args) {
        System.out.println(isordered(1,2,4, false));
        System.out.println(isordered(1,2,1,false));
        System.out.println(isordered(1,1,2,true));
    }
}