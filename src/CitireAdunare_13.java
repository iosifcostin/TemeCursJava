import java.util.Scanner;

public class CitireAdunare_13 {
    public static void main(String[] args) {

        int nr=0;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduceti Numere: ");

        nr = in.nextInt();

        int sum = 0;

        while (nr!=0) {

            nr = in.nextInt();

            if (nr>4 && nr<11)
                sum= sum +nr;
        }
        System.out.println("Suma numerelor mai mari ca 4 si mai mici decat 11 este: " + sum);


    }
}
