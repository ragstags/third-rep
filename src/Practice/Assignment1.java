package Practice;

/**
 * Created by nadimchouglay on 09/07/2017.
 */
public class Assignment1 {
    public static int speedingfine(int speed,boolean isholiday){
        int maxspeed =80, minspeed =60, fine=0;
        if (isholiday){
            maxspeed+=5;
            minspeed+=5;
        }
        if(speed >=maxspeed) fine =200;
        if (speed <=minspeed)fine =0;
        if (speed >minspeed && speed >=maxspeed) fine =100;

        return fine;


    }

    public static void main(String[] args) {
        System.out.println(speedingfine(60,false));
        System.out.println(speedingfine(70,false));
        System.out.println(speedingfine(65,true));
        System.out.println(speedingfine(95,true));
    }


}
