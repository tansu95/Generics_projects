package generics_task2;

public class Test {

    public static void main(String[] args) {
        // параметризируем класс типом String для ключа и значения
        Box<String, String> sample1 = new Box<>("имя", "Runtime");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box<Integer, Boolean> sample2 = new Box<>(1, Boolean.TRUE);
        System.out.println(sample2);
    }
}