package Practice;

/**
 * Created by nadimchouglay on 22/08/2017.
 */
public class Assignment19 {
    public static boolean birdssinging(int temp, boolean issummer) {
        //  if (issummer) {
        //     return (temp >= 60 && temp <= 100);
        // } else {
        //     return (temp >= 60 && temp <= 90);
        //   }

        // }
        return (issummer) ? (temp >= 60 && temp <= 100) : (temp >= 60 && temp <= 90);

    }

    public static void main(String[] args) {


        System.out.println(birdssinging(70,false));
        System.out.println(birdssinging(96,false));
        System.out.println(birdssinging(95,true));

    }
}