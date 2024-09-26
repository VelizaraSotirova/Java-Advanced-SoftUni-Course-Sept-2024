package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_Add_Vat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> prices = Arrays.stream(sc.nextLine()
                .split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Function<Double, Double> vatPrices = price -> price * 1.2;
        Consumer<Double> printVatPrices = price -> System.out.printf("%.2f%n", price);

        System.out.println("Prices with VAT:");
//        for (Double price : prices) {
//            double priceWithVat = vatPrices.apply(price);
//            System.out.printf("%.2f\n", priceWithVat);
//        }

        prices.stream()
                .map(vatPrices)
                .forEach(printVatPrices);
    }
}
