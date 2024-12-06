/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package oops.mubir.pls.strlmd.exercise;

import oops.mubir.pls.strlmd.FProduct;
import oops.mubir.pls.strlmd.Category;

import java.util.ArrayList;
import java.util.List;

public class LambdasExercise02 {

    public interface ProductFilter {
        boolean accept(FProduct product);
    }

    /**
     * Exercise 2: Find products by category by implementing a functional interface using a lambda expression and calling it.
     *
     * @param products The list of products to search.
     * @param category The category of products to search for.
     * @return A new list containing the products which are in the specified category.
     */
    public List<FProduct> findProductsByCategory(List<FProduct> products, Category category) {
        // TODO: Implement interface ProductFilter with a lambda expression
        // The lambda expression should return true if the product is in the given category
        ProductFilter filter = null; // TODO: Replace 'null' by a lambda expression

        List<FProduct> result = new ArrayList<>();
        for (FProduct product : products) {
            // TODO: Add products that are accepted by the filter to the 'result' list
        }

        return result;
    }
}
