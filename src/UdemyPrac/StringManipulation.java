package UdemyPrac;

/**
 * Created by nadimchouglay on 23/09/2018.
 */
public class StringManipulation {
    public static void main(String[] args) {
        String str = "ABCDEFg";
        str.length();
        String extractedString = str.substring(0,4);
        char ab= str.charAt(3);
        System.out.println(extractedString);
        System.out.println(ab);
    }
}
