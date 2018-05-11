public class AltfelProblema_6 {
    public static void main(String[] args) {
        //initializari
        int[] sirArray={4,2,9,10,11,101,92,91};
        int[] sirDublat=new int[sirArray.length];
        int i=0;
        int max=sirArray[0];
        int min=sirArray[0];
        int suma=0;

        for (i=0;i<sirArray.length;i++)
        {
            //maximul
            if (max<sirArray[i])
                max=sirArray[i];

            //minimul
            if(min>sirArray[i])
                min=sirArray[i];

            suma=suma+sirArray[i];
            sirDublat[i]=2*sirArray[i];
        }

        System.out.println("Numarul maxim este "+max);
        System.out.println("Nmarul minim este "+min);
        System.out.println("Suma numerelor din sir este "+suma);
        System.out.println("Sirul dublat este" );

        //afisarea sirului dublat
        for (i=0;i<sirDublat.length;i++)
        {
            System.out.print(sirDublat[i]+" ");
        }

    }
}
