package Practice;

/**
 * Created by nadimchouglay on 22/08/2017.
 */
public class Assignment20 {
    public static boolean isOrdered(int first, int second, int third, boolean itsok) {
        if (itsok) {
            return (third > second);

        } else {
            return (first<second)&&(second<third) &&(first<third);
        }
    }

    public static void main(String[] args) {
        System.out.println(isOrdered(1,2,4,false));
        System.out.println(isOrdered(1,2,1,false));
        System.out.println(isOrdered(1,1,2,true));
    }
}