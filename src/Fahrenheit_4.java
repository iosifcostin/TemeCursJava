import java.util.*;

class Fahrenheit_4 {
    public static void main(String[] args) {
        double temperatue;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperatue in Fahrenheit");
        temperatue = in.nextInt();

        temperatue = ((temperatue - 32)*5)/9;

        System.out.println("Temperatue in Celsius = " + temperatue);
    }
}