package lesson4.figure;

public abstract class Figure {
    protected String fillColor;
    protected String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public abstract void info();
}
