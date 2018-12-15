/**
 * Created by nadimchouglay on 12/07/2017.
 */
public class Assignment6 {
    public static String FizzyWizzy(int n) {
        boolean fizz =(n%3==0);
        boolean buzz =(n%5==0);
        if (fizz&&buzz)
            return "FizzBuzz!";
        if(fizz) return "Fizz!";
        if (buzz)return "Buzz!";
          return n+"!";


    }

    public static void main(String[] args) {
        System.out.println(FizzyWizzy(1));
        System.out.println(FizzyWizzy(2));
        System.out.println(FizzyWizzy(3));
        System.out.println(FizzyWizzy(15));
    }


}