package compositePattern;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        ProductComponent coffee = new Product("Coffee", 10);
        ProductComponent tea = new Product("Tea", 5);
        ProductComponent cake = new Product("Cake", 12);

        List<ProductComponent> products = Arrays.asList(coffee, tea, cake);
        ProductComponent table = new Table(products);

        table.showProperty();
        System.out.println("Total Price: " + table.totalPrice());
    }
}
