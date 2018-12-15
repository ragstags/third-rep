/**
 * Created by nadimchouglay on 14/07/2017.
 */
public class Assignment16 {
    public static int longeststreak(String str){
        int max =0;
        for (int i =0;i<str.length();i++){
            int count =0;
            for (int j=i; j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)) count++;
                else break;
            }
            if (count>max)
                max=count;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longeststreak("hayyyeu"));
        System.out.println(longeststreak("XPNzzzzddoooxx"));
    }
}
