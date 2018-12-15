/**
 * Created by nadimchouglay on 13/07/2017.
 */
public class Assignment13 {
    public static String starkill(String str){
        int len =str.length();
        String result ="";
        for (int i=0;i<len;i++){
            if (i==0 && str.charAt(i)!='*')
            result +=str.charAt(i);
            if (i>0 &&str.charAt(i)!='*'&&str.charAt(i-1)!='*')
                result+=str.charAt(i);
            if (i>0 && str.charAt(i)=='*'&&str.charAt(i-1)!='*')
                result =result.substring(0,result.length()-1);

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(starkill("ab*cd"));
        System.out.println(starkill("cd*za"));
        System.out.println(starkill("wacy*xko"));
    }
}
