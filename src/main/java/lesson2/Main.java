package lesson2;

public class Main {

    public static void main(String[] args) {
        //1
        System.out.println(checkSum(5, 7));
        //2
        checkPositiveAndWrite(8);
        //3
        System.out.println(isNegativeNumber(-3));
        //4
        writeSentenceSomeTime("Hi", 3);
        //5
        System.out.println(isLeapYear(2020));
        //6
        printArray(createArrayAndChange());
        //7
        printArray(arrayHundred());
        //8
        printArray(createArrayAndMultiply());
        //9
        printMatrix(createMatrix(5));
        //10
        printArray(createAndInitialiseArray(5, 9));
        //10*
        createArrayAndFindMaxMin();
        //10**
        System.out.println(findEqualsPart(new int[]{1, 2, 3, 3, 2, 1}));
    }

    //1
    public static boolean checkSum(int a, int b) {
        boolean result = false;
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            result = true;
        }
        return result;
    }

    //2
    public static void checkPositiveAndWrite(int a) {
        if (a < 0) {
            System.out.println("Число: " + a + " отрицательное");
        } else {
            System.out.println("Число: " + a + " положительное");
        }
    }

    //3
    public static boolean isNegativeNumber(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    //4
    public static void writeSentenceSomeTime(String s, int a) {
        int i = 0;

        if (a > 0) {
            while (i < a) {
                System.out.println(s);
                i++;
            }
        }
    }

    //5
    public static boolean isLeapYear(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    //6
    public static int[] createArrayAndChange() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }

    //7
    public static int[] arrayHundred() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    //8
    public static int[] createArrayAndMultiply() {
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6)
                array3[i] = array3[i] * 2;
        }
        return array3;
    }

    //9
    public static int[][] createMatrix(int x) {
        int[][] matrix = new int[x][x];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                if (matrix.length - 1 - i == j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    //10
    public static int[] createAndInitialiseArray(int len, int initialValue) {
        if (len < 0) {
            return new int[0];
        }
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //10*
    public static void createArrayAndFindMaxMin() {
        int[] array = {2, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }

    //10**
    public static boolean findEqualsPart(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            right += arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            left += arr[j];
            right -= arr[j];
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


