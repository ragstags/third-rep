package Practice;

/**
 * Created by nadimchouglay on 25/08/2017.
 */
public class Assignment26 {
    public static String RepeatChar(String str) {
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char aChar = str.charAt(i);
            result =result +aChar +aChar;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(RepeatChar("the"));
        System.out.println(RepeatChar("AAbb"));
        System.out.println(RepeatChar("Hi there§"));
    }
}