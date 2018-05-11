/*Se da un sir. Sa se extraga toate numerele intre doua
valori sis sa se puna intr-un alt sir si care apoi sa se afiseze*/

import java.util.Arrays;

public class Problema_21 {
    public static void main(String[] args) {

        int sir [] = {12, 44, 76, 29, 3, 49, 6, 127, 8, 22};

        int counter = 0;

        int sir2 [] = new int[sir.length];


        int nr1 = SkeletonJava.readIntConsole("Primul numar: ");
        int nr2 = SkeletonJava.readIntConsole("Al doilea numar: ");



        for (int i=0; i<sir.length; i++) {
            if ((sir[i] >= nr1 && sir[i] <= nr2) || (sir[i] <= nr1 && sir[i] >= nr2)) {

                sir2[counter] = sir[i];
                counter++;

            }
        }

        int sir3 [] = Arrays.copyOfRange(sir2, 0, counter);

        System.out.println("Intre aceste valori avem sirul: " + Arrays.toString(sir3));


        }



    }

