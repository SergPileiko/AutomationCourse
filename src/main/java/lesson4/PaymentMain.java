package lesson4;

public class PaymentMain {
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

    }
}
