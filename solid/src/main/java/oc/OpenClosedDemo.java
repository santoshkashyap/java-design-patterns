package oc;

import java.util.ArrayList;
import java.util.List;

public class OpenClosedDemo {

    public static void main(String[] args) {
        Product house = new Product("House", Color.BLUE, Size.HUGE);
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product laptop = new Product("Mac", Color.RED, Size.MEDIUM);

        List<Product> products = new ArrayList<>();

        products.add(house);
        products.add(apple);
        products.add(laptop);

        System.out.println("Products -> "+ products);

        System.out.println("Product filter (old)" );

        ProductFilter pf = new ProductFilter();
        pf.filterByColor(products, Color.GREEN).forEach(System.out::println);
        pf.filterBySize(products, Size.MEDIUM).forEach(System.out::println);


    }

}
