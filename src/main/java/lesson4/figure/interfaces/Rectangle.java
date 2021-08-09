package lesson4.figure.interfaces;

public interface Rectangle {

    default double perimeter(double a, double b) {
        return 2 * (a + b);
    }

    default double area(double a, double b) {
        return a * b;
    }
}
