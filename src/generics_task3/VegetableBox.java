package generics_task3;

public class VegetableBox<K, T extends Vegetable> {
    private K name;
    private T obj;

    public VegetableBox(K name, T obj) {
        this.name = name;
        this.obj = obj;
    }

    public K getName() {
        return name;
    }

    public T getObj() {
        return obj;
    }
}