package generics_task3;

public class Box<K, T extends Fruit> {
    private K name;
    private T obj;

    public Box(K name, T obj) {
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