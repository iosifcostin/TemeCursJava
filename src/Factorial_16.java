public class Factorial_16 {
    public static void main(String[] args) {

        int a = SkeletonJava.readIntConsole("Introduceti nnumarul: ");

        int factorial = 1;

        for (int i=1; i<=a; i++)
            factorial = factorial * i;

        System.out.println("Factorialul numarului este: " + factorial);




    }
}
