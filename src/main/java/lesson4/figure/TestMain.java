package lesson4.figure;

public class TestMain {
    public static void main(String[] args) {
        // task 8
        CircleImpl circle = new CircleImpl("blue", "red", 8);
        RectangleImpl rectangle = new RectangleImpl("black", "gray", 6.5, 5);
        TriangleImpl triangle = new TriangleImpl("white", "yellow", 7, 9.7, 4.2);

        circle.info();
        rectangle.info();
        triangle.info();
    }
}
