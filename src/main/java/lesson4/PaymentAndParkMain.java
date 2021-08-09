package lesson4;

import java.time.LocalTime;

public class PaymentAndParkMain {
    public static void main(String[] args) {
        // task 6
        Payment payment = new Payment("Alex Ivanov");

        Payment.Product product1 = payment.new Product("book", 25);
        Payment.Product product2 = payment.new Product("pen", 5);
        Payment.Product product3 = payment.new Product("desk", 110);

        payment.addProduct(product1);
        payment.addProduct(product2);
        payment.addProduct(product3);

        payment.info();

        // task 7
        Park park = new Park("Dreamland");

        Park.Attraction attraction1 = park.new Attraction("Карусель", LocalTime.of(10, 30), LocalTime.of(21, 00), 5);
        Park.Attraction attraction2 = park.new Attraction("Горки", LocalTime.of(9, 10), LocalTime.of(20, 30), 15);
        Park.Attraction attraction3 = park.new Attraction("Молот", LocalTime.of(11, 00), LocalTime.of(19, 40), 10);

        park.addAttraction(attraction1);
        park.addAttraction(attraction2);
        park.addAttraction(attraction3);

        park.infoAboutAttractions();
    }
}
