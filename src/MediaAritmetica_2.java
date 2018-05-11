public class MediaAritmetica_2 {
    public static void main(String[] args) {
       // a doua sau mai multe numere

        int [] arr = {2, 3, 5, 0, 7, 13, 3};
        int sum=0;
        double avg=0;
//        for (int i=0; i<arr.length; i++) {
//            sum = sum+arr[i];
//        }
//        avg = (double)sum/arr.length;
//        System.out.println(avg);

        // sau
            for (int x : arr) {
                sum = sum + x;
            }
            avg = (double) sum / arr.length;
            System.out.println(avg);

    }
}
