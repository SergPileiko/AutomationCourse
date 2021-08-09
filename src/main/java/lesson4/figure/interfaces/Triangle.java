package lesson4.figure.interfaces;

public interface Triangle {

    default double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    default double area(double a, double b, double c) {
        double result;
        double p = (a + b + c) / 2;
        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }
}
