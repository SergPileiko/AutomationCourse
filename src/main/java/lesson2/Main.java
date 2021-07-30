package lesson2;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkSum(5, 7));

        checkPositiveAndWrite(8);

        System.out.println(isNegativeNumber(0));

        writeSentenceSomeTime("Hi", 3);

    }

    public static boolean checkSum(int a, int b) {
        boolean result = false;
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            result = true;
        }
        return result;
    }

    public static void checkPositiveAndWrite(int a) {
        if (a < 0) {
            System.out.println("Число: " + a + " отрицательное");
        } else {
            System.out.println("Число: " + a + " положительное");
        }
    }

    public static boolean isNegativeNumber(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void writeSentenceSomeTime(String s, int a) {
        int i = 0;

        if (a > 0) {
            while (i < a) {
                System.out.println(s);
                i++;
            }
        }
    }
}


