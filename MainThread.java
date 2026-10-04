package ngay6;

public class MainThread {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = Converter.fahrenheitToCelsius(fahrenheit);

        System.out.println(fahrenheit + " độ F = " + celsius + " độ C");
        double inch = 10;
        double meter = Converter.inchToMeter(inch);

        System.out.println(inch + " inch = " + meter + " mét");
        double meter2 = 2;
        double inch2 = Converter.meterToInch(meter2);

        System.out.println(meter2 + " mét = " + inch2 + " inch");
    }
}
