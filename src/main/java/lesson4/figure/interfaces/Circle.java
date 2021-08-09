package lesson4.figure.interfaces;

public interface Circle {

    default double perimeter(double r) {
        return 2 * Math.PI * r;
    }

    default double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
