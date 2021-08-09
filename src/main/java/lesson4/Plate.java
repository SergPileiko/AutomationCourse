package lesson4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (n <= food && n >= 0) {
            food -= n;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood(int amountFood) {
        if (amountFood > 0) {
            food += amountFood;
        }
    }
}
