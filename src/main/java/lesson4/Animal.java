package lesson4;

public abstract class Animal {
    private static int countAnimal;
    private String name;
    private int swimDistanceMax;
    private int runDistanceMax;

    public Animal(String name, int runDistanceMax, int swimDistanceMax) {
        this.name = name;
        this.runDistanceMax = runDistanceMax;
        this.swimDistanceMax = swimDistanceMax;
        countAnimal++;
    }

    public void run(int distanceNeed) {
        int distanceReal = (distanceNeed <= runDistanceMax) ? distanceNeed : runDistanceMax;
        System.out.println(name + " пробежал " + distanceReal + "м.");
    }

    public void swim(int distanceNeed) {
        int distanceReal = (distanceNeed <= swimDistanceMax) ? distanceNeed : swimDistanceMax;
        System.out.println(name + " проплыл " + distanceReal + "м.");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public String getName() {
        return name;
    }
}

