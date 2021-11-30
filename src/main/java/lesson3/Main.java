package lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anastasiya Petrova", "Sell manager", "anatpet@abc.com", 293498600, 900, 28);
        employees[1] = new Employee("Ekaterina Ivanova", "Accountant", "kat.iv@abc.com", 293687741, 1100, 47);
        employees[2] = new Employee("Dmitriy Hotik", "Engineer", "ditriy@abc.com", 295524110, 1900, 35);
        employees[3] = new Employee("Elena Volkova", "Engineer", "volk@abc.com", 446632211, 1100, 32);
        employees[4] = new Employee("Anton Sidorov", "Chief engineer", "boss@abc.com", 299770024, 3100, 51);

        findInformationByAgeOlder(employees, 40);
    }

    public static void findInformationByAgeOlder(Employee[] empArray, int age) {
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() >= age) {
                empArray[i].showAllDetails();
            }
        }
    }
}
