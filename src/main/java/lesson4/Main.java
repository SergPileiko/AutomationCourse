package lesson4;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Rex");
        Animal dog2 = new Dog("Бобик");
        Animal cat1 = new Cat("Феликс");

        dog1.swim(5);
        dog2.swim(860);
        cat1.swim(30);
        dog1.run(67);
        dog2.run(910);
        cat1.run(220);

        System.out.println("Всего животных:" + Animal.getCountAnimal());
        System.out.println("Всего собак:" + Dog.getCountDog());
        System.out.println("Всего котов:" + Cat.getCountCat());

    }
}
