package Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _06_Product_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> shopInfo = new TreeMap<>();

        // Read the input
        String input = sc.nextLine();
        while (!input.equals("Revision")) {
            // "lidl, peach, 1.20"
            String[] tokens = input.split(", ");

            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            //If there is no products in the shop, we put an empty map
            shopInfo.putIfAbsent(shop, new LinkedHashMap<>());
            //Get that empty map
            Map<String, Double> productInfo = shopInfo.get(shop);
            //Put the product and its price to the shop
            productInfo.putIfAbsent(product, price);

            input = sc.nextLine();
        }

        //Printing the info
        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shopInfo.entrySet()) {
            System.out.println(entry.getKey() + "->");
            Map<String, Double> productInfo = entry.getValue();
            for (Map.Entry<String, Double> productPriceEntry : productInfo.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", productPriceEntry.getKey(), productPriceEntry.getValue());
            }
        }
    }
}
