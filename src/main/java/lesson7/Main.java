package lesson7;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String[] header = new String[]{"First", "Second", "Third"};
        int[][] data = new int[][]{{123, 234, 456}, {333, 222, 427}, {563, 11, 756}};
        File file = new File("test.csv");

        AppData appData = new AppData(header, data);

        save(appData, file);

        System.out.println(readFile(file));
    }

    public static void save(AppData appData, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < appData.getHeader().length; i++) {
                if (i != 0) {
                    writer.write(";");
                }
                writer.write(appData.getHeader()[i]);
            }
            for (int i = 0; i < appData.getData().length; i++) {
                for (int j = 0; j < appData.getData()[i].length; j++) {
                    if (j == 0) {
                        writer.write("\n" + appData.getData()[i][j]);
                    } else {
                        writer.write(";" + appData.getData()[i][j]);
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String readFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                stringBuilder.append(str);
                stringBuilder.append("\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
