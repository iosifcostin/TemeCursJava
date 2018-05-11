public class SumaPuteri_18 {
    public static void main(String[] args) {
        int x = SkeletonJava.readIntConsole("Da un numar: ");
        int n = SkeletonJava.readIntConsole("Mai da un numar: ");

        int x_La_n = 1;

        int sum = 1;

        for (int i=0; i<n; i++)
            x_La_n = x_La_n * x;
            sum = sum + x_La_n ;

        System.out.println(sum);





    }
}
