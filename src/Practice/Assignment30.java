package Practice;

/**
 * Created by nadimchouglay on 26/08/2017.
 */
public class Assignment30 {
    public static int longesttreak(String str){
        int max =0;
        for (int i =0;i<str.length();i++){
            int count =0;
            for (int j =i;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j))
                count++;
                else break;
            }
            if (count>max)
                max =count;
        }
        return max;
    }
}
