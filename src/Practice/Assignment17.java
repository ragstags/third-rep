package Practice;

/**
 * Created by nadimchouglay on 21/08/2017.
 */
public class Assignment17 {
    public static int speedingfine( int speed , boolean isholiday){

        int minspeed =60;
        int maxspeed = 80;
        int fine =0;
        if (isholiday) {
            minspeed +=5;
            maxspeed+=5;
        }
        if (speed>=maxspeed) fine =200;
        if (speed<=minspeed)fine =0;
        if (speed >minspeed && speed <=maxspeed) fine =100;
        return fine;
    }

    public static void main(String[] args) {
        System.out.println(speedingfine(60,false));
        System.out.println(speedingfine(65,false));
        System.out.println(speedingfine(65,true));
    }
}
