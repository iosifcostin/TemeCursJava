import java.util.Scanner;
public class CalculTva_7 {
    public static void main(String[] args) {
//     cu Scanner

        double pretProdus;
        double pretTva;
        Scanner in = new Scanner(System.in);

        System.out.println("Care este pretul?:");

        pretProdus = in.nextInt();

        pretTva = 0.19*pretProdus;

        System.out.println("TVA este: " + pretTva);

//        sau cu Skeleton

//        pretProdus=SkeletonJava.readIntConsole("Care este pretul?:");
//
//        SkeletonJava.printConsole(pretTva);


    }
}
