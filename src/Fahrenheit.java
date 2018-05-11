public class Fahrenheit {
    public static void main(String[] args) {
        int gFharenheit = SkeletonJava.readIntGUI("Enter temperatue in Fahrenheit:");
        double gCelsius = (gFharenheit-32)*5/9;
        SkeletonJava.printGUI("Temperatue in Celsius = "+gCelsius);





    }
}
