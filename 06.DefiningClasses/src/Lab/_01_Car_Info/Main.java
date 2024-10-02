package Lab._01_Car_Info;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] data = sc.nextLine().split("\\s+");
            String brand = data[0];

            Car car;
            if (data.length == 1) {
                car = new Car(brand);
            } else {
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                car = new Car(brand, model, horsePower);
            }

            System.out.println(car);
        }
    }
}
