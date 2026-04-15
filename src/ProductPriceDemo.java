import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo {
    public static void main(String[] args) {
        HashMap<String, Double> productPrice = new HashMap<>();
        productPrice.put("Apple", 1.500); // adding key and value to the HashMAp
        productPrice.put("Water", 0.500);
        productPrice.put("Choclate", 0.250);
        productPrice.put("Chips", 0.050);
        productPrice.put("Milk", 0.300);
        for (Map.Entry<String, Double> result : productPrice.entrySet()) { // printing HashMap
            System.out.println("product name: " + result.getKey() + "," + " product price: " + result.getValue());
        }
        System.out.println("the price of Apple is: " + productPrice.get("Apple"));
        System.out.println("check if Chips product is avilable or not: " + productPrice.containsKey("Chips"));
        System.out.println("the HashMap after updated is:");
        productPrice.put("Choclate", 0.250); // update the price using key or product name
        for (Map.Entry<String, Double> result : productPrice.entrySet()) { // printing HashMap
            System.out.println("product name: " + result.getKey() + "," + " product price: " + result.getValue());
        }
        productPrice.remove("Apple"); // removing one product using key or product name
        System.out.println("the HashMap after removing one is:");
        for (Map.Entry<String, Double> result : productPrice.entrySet()) { // printing HashMap
            System.out.println("product name: " + result.getKey() + "," + " product price: " + result.getValue());
        }
        System.out.println("the total size of the HashMap is: " + productPrice.size());
    }

}
