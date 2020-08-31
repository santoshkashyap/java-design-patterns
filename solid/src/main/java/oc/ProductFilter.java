package oc;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, final Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, final Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products,
        final Color color,
        final Size size) {
        return products.stream().filter(p -> p.getColor() == color && p.getSize() == size);
    }

}
