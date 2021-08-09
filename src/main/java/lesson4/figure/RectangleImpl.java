package lesson4.figure;

import lesson4.figure.interfaces.Rectangle;

public class RectangleImpl extends Figure implements Rectangle {
    private double sideA;
    private double sideB;

    public RectangleImpl(String fillColor, String borderColor, double sideA, double sideB) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void info() {
        System.out.print("Фигура прямоугольник. ");
        String text = String.format("Периметр: %.2f; площадь: %.2f; цвет фона: %s; цвет границ %s.",
                perimeter(sideA, sideB), area(sideA, sideB), fillColor, borderColor);
        System.out.println(text);
    }
}
