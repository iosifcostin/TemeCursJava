public class Sortare_19vAndreea {
    public static void main(String[] args) {

            int[] sir={200,5,7,21,1,106,0,145,76};
            int aux=sir[0];
            int ok=1;
            int i=0;
//        System.out.println(sir.length);


            for (i=0;i<sir.length-1;i++) {
                for (int j=i+1;j<sir.length;j++)
                    if (sir[i] > sir[j]) {
                        aux = sir[i];
                        sir[i] = sir[j];
                        sir[j] = aux;
                        ok = 0; //verificam daca sirul este ordonat sau nu
                    }
            }

            if(ok==1)
                System.out.println("Sirul este crescator");
            else
                for (i=0;i<sir.length;i++)
                    System.out.print(sir[i]+" ");
        }
    }
