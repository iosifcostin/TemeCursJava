/*Se da un sir. Sa se extraga toate numerele intre doua
valori sis sa se puna intr-un alt sir si care apoi sa se afiseze*/

public class Problema_21 {
    public static void main(String[] args) {

        int sir [] = {12, 44, 76, 29, 0, 49, 6, 127, 8, 22};

        int nr1 = SkeletonJava.readIntConsole("Primul numar: ");
        int nr2 = SkeletonJava.readIntConsole("Al doilea numar: ");

        int sir2 [] = new int[sir.length];

        System.out.println("Intre aceste valori sirul este: " );
        for (int i=0; i<sir.length; i++) {
            if ((sir[i]>=nr1 && sir[i]<=nr2) || (sir[i]<=nr1 && sir[i]>=nr2)) {

                sir2[i] = sir[i];
                }
            System.out.println(sir2[i]);

            }

        }



    }

