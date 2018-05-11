public class SirPerechiDeNr_17 {
    public static void main(String[] args) {

        int sirNr [] = {13, 45, 11, 34, 323, 56, 23, 87, 6, 60, 7};

        for (int i=0; i<sirNr.length; i++)

            if (sirNr[i]>sirNr[i+1])
                System.out.println(sirNr[i]+ " " +sirNr[i+1]);
    }
}
