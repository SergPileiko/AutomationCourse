package lesson4;

public class Dog extends Animal {
    private static int countDog;

    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name, MAX_RUN, MAX_SWIM);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }
}
