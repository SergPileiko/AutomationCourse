package lesson4.figure;

import lesson4.figure.interfaces.Triangle;

public class TriangleImpl extends Figure implements Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleImpl(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void info() {
        System.out.print("Фигура треугольник. ");
        String text = String.format("Периметр: %.2f; площадь: %.2f; цвет фона: %s; цвет границ %s.",
                perimeter(sideA, sideB, sideC), area(sideA, sideB, sideC), fillColor, borderColor);
        System.out.println(text);
    }
}
