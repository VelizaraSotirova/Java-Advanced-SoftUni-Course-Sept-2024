package Lab._03_Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(100, 10);
        System.out.println(scale.getHeavier());
    }
}
