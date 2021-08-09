package lesson4;

public class Cat extends Animal {
    private static int countCat;

    private int appetite;
    private boolean satiety;

    public static final int MAX_RUN = 200;
    public static final int MAX_SWIM = 0;

    public Cat(String name, int appetite) {
        super(name, MAX_RUN, MAX_SWIM);
        this.appetite = appetite;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    @Override
    public void swim(int distanceNeed) {
        System.out.println("Коты не умеют плавать");
    }
}
