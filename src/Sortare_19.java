import java.util.Arrays;

public class Sortare_19 {
    public static void main(String[] args) {
        int array [] = {3, 1, 6, 9, 2, 5, 4, 8, 7, 0};

        boolean sirCrescator=true;

       for (int i=1; i<=array.length; i++) {
           for (int j = 0; j< array.length-1; j++) {
               int k = j+1;
               int a = array[j];
               int b = array[k];
               if (b<a) {
                   array[j] = b;
                   array [k] = a;
                   sirCrescator = false;
               }
           }
       }   if (sirCrescator == true)
            System.out.println("Este crescator");
       else

            for (int d=0; d<array.length; d++)
            System.out.println(array[d]);

//
       // sau :

//       Arrays.sort(array);
//        for (int i=0; i<array.length; i++){
//            System.out.println(array[i]);
        }

    }
