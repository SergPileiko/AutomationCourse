
public class Triangle {

    public Triangle() {
    }

    public boolean canBe(int a, int b, int c) {
        boolean result = false;
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                result = true;
            }
        }
        return result;
    }

    public double area(int a, int b, int c) {
        double result = -1.0;
        if (canBe(a, b, c)) {
            double p = (a + b + c) / 2.0;
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }
}
