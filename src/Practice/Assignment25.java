package Practice;

/**
 * Created by nadimchouglay on 25/08/2017.
 */
public class Assignment25 {
    public static int partialSum(int a,int b,int c){
        if (c==13) return a+b;
        if (b==13) return a;
        if (a==13) return 0;
        else return a+b+c;

    }

    public static void main(String[] args) {
        System.out.println(partialSum(1,2,3));
        System.out.println(partialSum(1,2,13));
        System.out.println(partialSum(1,13,3));
    }
}
