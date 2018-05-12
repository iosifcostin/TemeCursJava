public class MediaAritmetica_3 {
    public static void main(String[] args) {

        //initializari
        final int MAX = 1000 ;       // "hard cod it"   -- constanta
        int[] numereArray=new int[MAX];
        double mediaAritmetica;
        int i=0;
        double suma=numereArray[0];


        //citirea primului numar
        numereArray[0]=SkeletonJava.readIntConsole(" Introduceti primul numar ");

        //citirea numerelor pana la intalnirea numarului 0
        while (numereArray[i]!=0 && i<MAX)
        {
            i++;
            numereArray[i]=SkeletonJava.readIntConsole("Introduceti numere ");
        }

        for (int j=0;j<i;j++)
        {
            suma=suma+numereArray[j];
        }

        //calcularea mediei cu formula
        mediaAritmetica=suma/(double)i;

        //afisare
        System.out.println("Media aritmetica este "+mediaAritmetica);








    }
}





