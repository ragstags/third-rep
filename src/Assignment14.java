/**
 * Created by nadimchouglay on 14/07/2017.
 */
public class Assignment14 {
    public static int wordsCount(String[] words,int len){
        int count =0;
        for (int i =0; i<words.length;i++){
            if (words[i].length()==len)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(wordsCount(new String[]{"a", "bb", "b", "ccc"},1));
        System.out.println(wordsCount(new String[]{"a","bb","ccc","b"},3));
    }

}
