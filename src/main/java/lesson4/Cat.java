package lesson4;

public class Cat extends Animal {
    private static int countCat;

    public static final int MAX_RUN = 200;
    public static final int MAX_SWIM = 0;

    public Cat(String name) {
        super(name, MAX_RUN, MAX_SWIM);
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void swim(int distanceNeed) {
        System.out.println("Коты не умеют плавать");
    }
}
