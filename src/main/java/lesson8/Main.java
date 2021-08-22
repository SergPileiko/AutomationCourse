package lesson8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] strArr = new String[]{"Массив", "Коллекция", "Сортировка", "Матрица",
                "Утро", "День", "Массив", "Коллекция", "Массив", "Вечер", "Книга", "Солнце", "Утро"};

        findUnique(strArr);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Котов", "322-22-22");
        phonebook.add("Котов", "663-78-77");
        phonebook.add("Мышкин", "555-25-22");
        phonebook.add("Иванов", "636-28-00");
        phonebook.add("Сидоров", "111-45-43");

        System.out.printf("%10s | %10s\n", "Фамилия", "Номер телефона");
        phonebook.get("Сидоров");
        phonebook.get("Котов");

    }

    public static void findUnique(String[] strArr) {
        Map<String, Integer> map = new HashMap<>(strArr.length);
        int count;
        for (String str : strArr) {
            count = 1;
            if (map.get(str) != null) {
                count = map.get(str) + 1;
            }
            map.put(str, count);
        }
        System.out.printf("%10s | %10s\n", "Уник. слова", "Встречается раз");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("%10s %10s\n", entry.getKey(), entry.getValue());
        }
    }
}
