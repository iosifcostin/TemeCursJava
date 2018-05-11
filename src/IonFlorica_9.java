import java.util.Scanner;
public class IonFlorica_9 {
    public static void main(String[] args) {

      final  int distanta = 13;  //Km
        int vIon;
        int vFlorica;


        Scanner in = new Scanner(System.in);

        System.out.println("Viteza lu' Ion: ");

        vIon = in.nextInt();

        System.out.println("Viteza lu' Florica: ");

        vFlorica = in.nextInt();

        double dpI = 0;          //distanta parcursa de ion
        double tmp =0;

        dpI = distanta*vIon/(vFlorica+vIon);
        tmp = dpI/vIon*60;

        System.out.println("Ion se intalneste cu Florica dupa " + tmp + " minute, la " + dpI + "km de Cluj" );



    }
}
