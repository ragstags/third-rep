package Practice;

/**
 * Created by nadimchouglay on 12/07/2017.
 */
public class Assignment3 {
    public static boolean birdsSinging(int temp){
        boolean isSummer=false;// check that th output differs when you change the default to true....
        return (isSummer)?(temp>=60 && temp<=100):(temp>=60 &&temp<=90);
    }

    public static void main(String[] args) {
        System.out.println(birdsSinging(70));
        System.out.println(birdsSinging(95));
        System.out.println(birdsSinging(95));
    }

}
