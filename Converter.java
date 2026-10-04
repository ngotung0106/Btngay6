package ngay6;

public class Converter {
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double inchToMeter(double inch) {
        return inch * 0.0254;
    }

    public static double meterToInch(double meter) {
        return meter / 0.0254;
    }
}