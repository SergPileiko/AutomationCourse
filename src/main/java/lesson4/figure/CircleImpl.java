package lesson4.figure;

import lesson4.figure.interfaces.Circle;

public class CircleImpl extends Figure implements Circle {
    private double radius;

    public CircleImpl(String fillColor, String borderColor, double radius) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public void info() {
        System.out.print("Фигура круг. ");
        String text = String.format("Периметр: %.2f; площадь: %.2f; цвет фона: %s; цвет границ %s.",
                perimeter(radius), area(radius), fillColor, borderColor);
        System.out.println(text);
    }
}
