/**
 * Created by nadimchouglay on 13/07/2017.
 */
public class Assignment12 {
    public static String repeatchar(String str){
        String result ="";
        for (int i =0;i<str.length();i++){
            char aChar =str.charAt(i);
            result =result +aChar +aChar;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(repeatchar("The"));
        System.out.println(repeatchar("AAbb"));
        System.out.println(repeatchar("Hi-There"));
    }
}
