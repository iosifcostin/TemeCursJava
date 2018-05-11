// Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.

public class TabelaConversie_5{
    public static void main(String[] args) {
        System.out.println("Tabela conversie Fahrenheit-Celsius");
        int x = SkeletonJava.readIntConsole("intre : ");
        int y = SkeletonJava.readIntConsole("si : ");

        float celsius;

        for (int i = x; i<=y; i++){
            celsius = (float)(i-32)*5/9;
            SkeletonJava.printConsole(i+ " Fahrenheit = " + celsius + " Celsius" );
        }



    }
}
