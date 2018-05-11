public class UnNrLaPutereaN_15 {
    public static void main(String[] args) {

        int a = SkeletonJava.readIntConsole("Numarul: ");
        int n = SkeletonJava.readIntConsole("La puterea : ");

        int aLaPuterea_n = 1;

        for (int i=0; i<n; i++)
            aLaPuterea_n *= a;

        System.out.println("Rezultat = " + aLaPuterea_n);







    }
}
