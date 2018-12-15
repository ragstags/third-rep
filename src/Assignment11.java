/**
 * Created by nadimchouglay on 13/07/2017.
 */
public class Assignment11 {
    public static int partialSum(int a ,int b,int c){
        if(b==13) return a;
        if (c==13) return a+b;
        if (a==13) return 0;
        return a+b+c;

    }

    public static void main(String[] args) {
        System.out.println(partialSum(1,2,3));
        System.out.println(partialSum(1,2,13));
        System.out.println(partialSum(1,13,3));
    }
    
}
