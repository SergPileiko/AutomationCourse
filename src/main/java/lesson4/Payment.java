package lesson4;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private int amountPayment;
    private String payer;
    private List<Product> products;

    public Payment() {
    }

    public Payment(String payer) {
        this.payer = payer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        amountPayment += product.cost;
    }

    public class Product {
        private String name;
        private int cost;

        public Product(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }

    public void info() {
        System.out.println("Плательщик " + payer);
        System.out.print("Товары: ");
        for (Product p : products) {
            System.out.print(p.name + " ");
        }
        System.out.println("\nОбщая стоимость: " + amountPayment);
    }
}
