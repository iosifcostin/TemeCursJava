public class NrMaxNrMinSumDouble_6 {
    public static void main(String[] args) {
        int [] sir = {4, 7, 9, 34, 2, 85, 32, 14, 1};

        int nrMax = sir[0];
        int nrMin = sir[0];
        int sum = 0;
        int sirDublat =0;
//        suma


        for (int x=0; x<sir.length; x++) {
            sum=sum+sir[x];
        }
        System.out.println("Suma: " +sum);


//        sir dublat

        for (int t: sir) {
            sirDublat = t * 2;
            System.out.println(sirDublat);

        }

//        Cel mai mare

        for (int i=0; i<sir.length; i++) {
            if (nrMax<sir[i])
                nrMax=sir[i];
        }
        System.out.println("Cel mai mare este: "+nrMax);

//       Cel mai mic

        for (int f=0; f<sir.length; f++) {
            if (nrMin>sir[f])
                nrMin=sir[f];
        }
        System.out.println("Cel mai mic este: " +nrMin);
    }
}
