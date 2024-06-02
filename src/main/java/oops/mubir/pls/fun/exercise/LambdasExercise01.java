
package oops.mubir.pls.fun.exercise;

import oops.mubir.pls.fun.ExampleData;
import oops.mubir.pls.fun.FProduct;

import java.util.List;

public class LambdasExercise01 {

    /**
     * Exercise 1: Sort a list of products by name using a lambda expression.
     *
     * @param products The list of products to sort.
     */
    public static void sortProductsByName(List<FProduct> products) {
        // TODO: Use a lambda expression to sort the list of products by name
        products.sort(
                (FProduct a, FProduct b) -> {
                    return a.getName().compareTo(b.getName());
                }
        );

        products.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<FProduct> products = ExampleData.getFProducts();

        sortProductsByName(products);
    }
}
