/*
 * This code is part of the course "Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)" for Pluralsight.
 *
 * Copyright (C) 2021 by Jesper de Jong (jesper@jdj-it.com).
 */
package oops.mubir.pls.strlmd.exercise;

import oops.mubir.pls.strlmd.FProduct;
import oops.mubir.pls.strlmd.Category;

import java.math.BigDecimal;
import java.util.function.Predicate;

public class FunctionalInterfacesExercise02 {

    public static class SearchCriteria {
        private Category category;
        private String namePattern;
        private BigDecimal minimumPrice;
        private BigDecimal maximumPrice;

        public SearchCriteria(Category category, String namePattern, BigDecimal minimumPrice, BigDecimal maximumPrice) {
            this.category = category;
            this.namePattern = namePattern;
            this.minimumPrice = minimumPrice;
            this.maximumPrice = maximumPrice;
        }
    }

    /**
     * Exercise 2: Write a method that composes a Predicate for a given set of search criteria.
     * <p>
     * Use functional composition to create a Predicate. Check if each of the fields in the search criteria is not null.
     * Combine the different predicates for each of the fields in the appropriate way - include a predicate if the
     * corresponding search criteria field is not null.
     *
     * @param criteria Search criteria.
     * @return A Predicate that returns true for products that match the combination of search criteria.
     */
    public Predicate<FProduct> createSearchPredicate(SearchCriteria criteria) {
        Predicate<FProduct> categoryIs = product ->product.getCategory().equals(criteria.category); /* TODO: Implement a lambda expression that checks if a product's category is equal to criteria.category */;
        Predicate<FProduct> nameMatches = product -> product.getName().matches(criteria.namePattern);
        Predicate<FProduct> minimumPriceIs = product -> product.getPrice().compareTo(criteria.maximumPrice)>=0; /* TODO: Implement a lambda expression that checks if a product's price is greater than criteria.minimumPrice */;
        Predicate<FProduct> maximumPriceIs = product -> product.getPrice().compareTo(criteria.maximumPrice) <= 0;

        Predicate<FProduct> predicate = product -> true; /* TODO: Implement a lambda expression that takes a product and always returns true */;

        if (criteria.category != null) {
            categoryIs = categoryIs.and(nameMatches);
            // TODO: Update 'predicate' to combine it with the 'categoryIs' predicate.
        }

        // TODO: Do the same for the other search criteria and corresponding predictates:
        // - if criteria.namePattern is not null, include the 'nameMatches' predicate
        // - if criteria.minimumPrice is not null, include the 'minimumPriceIs' predicate
        // - if criteria.maximumPrice is not null, include the 'maximumPriceIs' predicate

        return predicate;
    }
}
