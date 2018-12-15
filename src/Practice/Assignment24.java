package Practice;

/**
 * Created by nadimchouglay on 25/08/2017.
 */
public class Assignment24 {
    public static int nearestTwentyone(int a,int b){
        if (a>21 &&b>21) return 0;
        if (a>21 && b<=21)return b;
        if (b>21 && a<=21)return a;
        if (a>b) return a;
        else return b;

    }

    public static void main(String[] args) {
        System.out.println(nearestTwentyone(19,21));
        System.out.println(nearestTwentyone(21,19));
        System.out.println(nearestTwentyone(19,22));
        System.out.println(nearestTwentyone(32,22));
    }
}
