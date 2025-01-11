package oops.mubir.pls.strlmd.exercise;

import oops.mubir.pls.strlmd.Category;
import oops.mubir.pls.strlmd.FProduct;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvancedStreamsExercise04 {

    /**
     * Exercise 4: Split the products into food and non-food products and get their names.
     *
     * @param products A list of products.
     * @return A map containing the names of the food products and the non-food products.
     */
    public Map<Boolean, List<String>> getFoodAndNonFoodProductNames(List<FProduct> products) {
        // TODO: Partition the products into food and non-food products, and transform them into product names.
        //
        // Return a map where the food product names are under the key 'true' and the non-food product names are under the key 'false'.
        //
        // Hint: How do you map the products to product names after partitioning them?

        return products.stream().collect(Collectors.partitioningBy(
                product -> product.getCategory() == Category.FOOD, // Partition based on category
                Collectors.mapping(FProduct::getName, Collectors.toList())
        ));

        /*
            Use partitioningBy when:
            The grouping is binary (e.g., true/false).
            Example: Splitting products into food vs non-food.
            Use groupingBy when:
            The grouping involves multiple categories.
            Example: Grouping products by their category or price range.
        **/

//        throw new UnsupportedOperationException("Not yet implemented"); // Remove this line
    }
}
