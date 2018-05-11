public class CitireAdunare_13v2 {
    public static void main(String[] args) {

        int nr = SkeletonJava.readIntConsole("Introduceti numere: ");
         int sum = 0;

         while (nr!=0) {

             nr = SkeletonJava.readIntConsole("");

             if (nr>4 && nr<11)

                 sum = sum + nr;

         }
        System.out.println("Suma numerelor mai mari ca 4 si mai mici decat 11 este: " + sum);
    }
}
