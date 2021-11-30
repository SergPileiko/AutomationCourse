package lesson2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char[][] matrix;
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        matrix = initMatrix(SIZE);
        printMatrix(matrix);

        while (true) {
            humanTurn();
            printMatrix(matrix);
            if (checkWin(DOT_X)) {
                System.out.println("Победа за человеком!");
                break;
            }
            if (isMatrixFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMatrix(matrix);
            if (checkWin(DOT_O)) {
                System.out.println("Победа за компьютером!");
                break;
            }
            if (isMatrixFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Конец игры!");

    }

    public static char[][] initMatrix(int size) {
        char[][] matrix = new char[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = DOT_EMPTY;
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y: ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        matrix[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в точку: " + (x + 1) + " " + (y + 1));
        matrix[y][x] = DOT_O;
    }


    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (matrix[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static boolean checkWin(char symbol) {
        int countToWin;
        int countToWin2;
        for (int i = 0; i < SIZE; i++) {
            countToWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == symbol) {
                    countToWin++;
                }
            }
            if (countToWin == DOTS_TO_WIN) {
                return true;
            }
        }

        for (int index = 0; index < SIZE; index++) {
            countToWin = 0;
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][index] == symbol) {
                    countToWin++;
                }
            }
            if (countToWin == DOTS_TO_WIN) {
                return true;
            }
        }

        countToWin = 0;
        countToWin2 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j) {
                    if (matrix[i][j] == symbol) {
                        countToWin++;
                    }
                }
                if (matrix.length - 1 - i == j) {
                    if (matrix[i][j] == symbol) {
                        countToWin2++;
                    }
                }
            }
            if (countToWin == DOTS_TO_WIN || countToWin2 == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMatrixFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (matrix[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}


