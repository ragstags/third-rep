package UdemyPrac;

/**
 * Created by nadimchouglay on 25/09/2018.
 */
public class ForLoops {
    public static void main(String[] args) {
        String name = "gdhsgjndmp";
        for (int i=name.length()-1;i>=0;i--){
            System.out.println("char:"+name.charAt(i));
        }
        for (int i=0;i<=100;i+=2){
            System.out.println(i);
        }

    }
}
