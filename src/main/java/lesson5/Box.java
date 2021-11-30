package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitList;

    public Box() {
        fruitList = new ArrayList<>();
    }

    public List<T> getFruitList() {
        return fruitList;
    }

    public float getWeight() {
        float result = 0;
        if (!fruitList.isEmpty()) {
            result = fruitList.size() * fruitList.get(0).getWeight();
        }
        return result;
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
    }

    public boolean compare(Box<?> secondBox) {
        return (Math.abs(this.getWeight() - secondBox.getWeight()) < 0.0001);
    }

    public void pourFromBox(Box<T> secondBox) {
        for (T fruit : secondBox.getFruitList()) {
            this.fruitList.add(fruit);
        }
        secondBox.getFruitList().clear();
    }
}
