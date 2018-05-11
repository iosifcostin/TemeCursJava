
/*Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate, iar pentru a doua jumatate
* sa se afiseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare*/

public class Problema_20 {
    public static void main(String[] args) {

        int sir[] = {3, 9, 13, 87, 4, 10, 46, 27, 39, 11};


            for(int i=0;i<sir.length/2;i++)
            {
                sir[i]=sir[i]*2;
            }

            for (int i=sir.length/2;i<sir.length;i++)
            {
                if(sir[i]%2!=0)
                    sir[i]=sir[i]*3;
            }

            for (int i=0;i<sir.length;i++)
                System.out.print(sir[i]+" ");

    }
}
