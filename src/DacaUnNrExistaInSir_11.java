import java.util.Scanner;

public class DacaUnNrExistaInSir_11 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti Numarul");
        number = in.nextInt();

        int indexOfNumber = -1;

        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i])
                indexOfNumber = i;
            }
        if (indexOfNumber!=-1) {
            System.out.println("L-am gasit pe pozitia " + indexOfNumber); }
        else {
            System.out.println("Nu l-am gasit");
        }


    }
    }
