package lesson6;

public class Main {
    public static void main(String[] args) {

        String[][] mas = new String[][]{{"3", "4", "5", "6"}, {"2", "2", "2", "2"},
                {"7", "7", "7", "7"}, {"1", "1", "1", "1"}};

        try {
            System.out.println("Сумма всех значений в матрице: " + checkMatrix(mas));
        } catch (MyArraySizeException sizeException) {
            sizeException.printStackTrace();
        } catch (MyArrayDataException dataException) {
            dataException.printStackTrace();
        }
    }

    public static int checkMatrix(String[][] mas) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        if (mas == null || mas.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < mas[i].length; j++) {
                try {
                    result += Integer.parseInt(mas[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(String.format("Ошибка! В ячейке [%d][%d] лежат неверные данные!", i, j));
                }
            }
        }
        return result;
    }
}
