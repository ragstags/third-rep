package Practice;

/**
 * Created by nadimchouglay on 23/08/2017.
 */
public class Assignment22 {
    public static String fizzyWizzy(int n){
        boolean fizz =n%3==0;
        boolean buzz =n%5==0;
        if(fizz && buzz) return "FizzBuzz !";
        if (fizz)return "Fizz!";
        if (buzz)return "buzz!";
        else return  n+"!";
    }

    public static void main(String[] args) {
        System.out.println(fizzyWizzy(1));
        System.out.println(fizzyWizzy(2));
        System.out.println(fizzyWizzy(3));
        System.out.println(fizzyWizzy(15));
    }
}
