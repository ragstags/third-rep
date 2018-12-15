package Practice;

/**
 * Created by nadimchouglay on 26/08/2017.
 */
public class Assignment28 {
    public static int wordsCount( String[] words,int len){
        int count =0;
        for (int i =0; i<words.length;i++){
            if (words[i].length()==len) count++;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bbb", "ccc"},1));
        System.out.println(wordsCount(new String[]{"a", "bb","b", "cc"},2));
        System.out.println(wordsCount(new String[]{"a", "bbb", "ccc"},2));
    }
}
