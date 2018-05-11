import java.util.Scanner;
public class TurtleSpeed_8 {
    public static void main(String[] args) {

        double distance;
        double hours;
        double speed;

        Scanner in = new Scanner(System.in);

        System.out.println("Cati Kilometri a parcurs broasca?:");

        distance = in.nextInt();

        System.out.println("In cate ore a parcurs aceasta distanta?:");

        hours = in.nextInt();

        speed = (distance*1000)/(hours*3600);

        System.out.println("Viteza broscutei a fost de " + speed + " m/s");







    }
}
