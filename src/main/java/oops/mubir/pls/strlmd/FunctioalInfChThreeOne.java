package oops.mubir.pls.strlmd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FunctioalInfChThreeOne {
    static List<Product> getData() {
        return new ArrayList<Product>() {{
            add(new Product(1, "one", 10.11));
            add(new Product(2, "two", 20.22));
            add(new Product(3, "three", 30.33));
        }};
    }

    static Optional<Product> filterProduct(List<Product> products, Predicate<Product> predicate) {
        for (Product x : products) {
            if (predicate.test(x))
                return Optional.of(x);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        List<Product> items = getData();

        // Optional<Product> result = filterProduct(items, item -> item.getPrice() > 25);
        //if (result.isPresent())
        //    result.get();

        filterProduct(items, item -> item.getPrice() > 25)
                .map(product -> product.getName().toUpperCase())//map from optional
                .ifPresentOrElse(//consumer , runnable
                        name -> System.out.println(name),
                        () -> System.out.println("bad luck no match")
                );

    }

}
