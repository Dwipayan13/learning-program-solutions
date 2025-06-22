import java.util.*;

public class SearchFunction {

    public static List<String> searchProducts(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Laptop", "Mobile", "Tablet", "Smartwatch", "Desktop");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine();

        List<String> results = searchProducts(products, keyword);
        
        if (results.isEmpty()) {
            System.out.println("No matching products found.");
        } else {
            System.out.println("Matching products: " + results);
        }

        scanner.close();
    }
}
