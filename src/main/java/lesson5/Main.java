package lesson5;

public class Main {
    public static void main(String[] args) {
        // task1
        String[] strArray = new String[]{"Hi", "Hello", "Good", "Привет", "55"};
        printArray(strArray);
        changeElementByIndex(strArray, 2, 3);
        printArray(strArray);

        // task2
        float weightApple = 1.0f;
        float weightOrange = 1.5f;

        Apple apple1 = new Apple(weightApple);
        Apple apple2 = new Apple(weightApple);
        Apple apple3 = new Apple(weightApple);
        Apple apple4 = new Apple(weightApple);
        Apple apple5 = new Apple(weightApple);

        Orange orange1 = new Orange(weightOrange);
        Orange orange2 = new Orange(weightOrange);
        Orange orange3 = new Orange(weightOrange);
        Orange orange4 = new Orange(weightOrange);

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox.addFruit(apple1);
        appleBox.addFruit(apple2);
        appleBox.addFruit(apple3);
        appleBox.addFruit(apple4);
        appleBox.addFruit(apple5);

        orangeBox.addFruit(orange1);
        orangeBox.addFruit(orange2);

        orangeBox2.addFruit(orange3);
        orangeBox2.addFruit(orange4);

        System.out.println("Масса коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Масса 1й коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Масса 2й коробки с апельсинами: " + orangeBox2.getWeight());

        System.out.println("Равны ли по весу коробки с апельсинами и яблоками? " + orangeBox.compare(appleBox));
        System.out.println("Равны ли по весу коробки с апельсинами? " + orangeBox.compare(orangeBox2));

        orangeBox.pourFromBox(orangeBox2);
        System.out.println("Масса 1й коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Масса 2й коробки с апельсинами: " + orangeBox2.getWeight());

    }

    public static void changeElementByIndex(String[] array, int a, int b) {
        if (a < array.length && b < array.length) {
            String temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

    public static void printArray(String[] arr) {
        System.out.print("[ ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.print("]\n");
    }
}
