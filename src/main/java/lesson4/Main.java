package lesson4;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Rex");
        Animal dog2 = new Dog("Бобик");
        Animal cat1 = new Cat("Феликс", 8);

        dog1.swim(5);
        dog2.swim(860);
        cat1.swim(30);
        dog1.run(67);
        dog2.run(910);
        cat1.run(220);

        System.out.println("Всего животных:" + Animal.getCountAnimal());
        System.out.println("Всего собак:" + Dog.getCountDog());
        System.out.println("Всего котов:" + Cat.getCountCat());

        // task 5
        Plate plate = new Plate(100);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Кекс", 10);
        cats[1] = new Cat("Алекс", 15);
        cats[2] = new Cat("Дымок", 7);
        cats[3] = new Cat("Каспер", 80);
        cats[4] = new Cat("Томас", 20);

        feedCats(cats, plate);
        printSatiety(cats);
        plate.info();
        plate.addFood(50);
        plate.info();

    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }

    public static void printSatiety(Cat[] cats) {
        String result;
        for (Cat cat : cats) {
            result = cat.isSatiety() ? " сыт" : " не сыт";
            System.out.println("Кот " + cat.getName() + result);
        }
    }
}
