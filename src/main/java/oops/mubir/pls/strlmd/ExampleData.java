package oops.mubir.pls.strlmd;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static oops.mubir.pls.strlmd.Category.*;

public class ExampleData {

    private static final List<FProduct> FProductS = Arrays.asList(
            new FProduct(FOOD, "Oranges", new BigDecimal("1.65")),
            new FProduct(FOOD, "Gouda cheese", new BigDecimal("6.79")),
            new FProduct(UTENSILS, "Plates", new BigDecimal("12.95")),
            new FProduct(CLEANING, "Detergent", new BigDecimal("3.79")),
            new FProduct(FOOD, "Soft drink", new BigDecimal("1.99")),
            new FProduct(OFFICE, "Pencils", new BigDecimal("5.79")),
            new FProduct(FOOD, "Rice", new BigDecimal("2.99")),
            new FProduct(CLEANING, "Scourer", new BigDecimal("2.29")),
            new FProduct(FOOD, "Milk", new BigDecimal("1.39")),
            new FProduct(OFFICE, "Notebook", new BigDecimal("4.99")),
            new FProduct(FOOD, "Tea", new BigDecimal("4.29")),
            new FProduct(FOOD, "Tomato sauce", new BigDecimal("1.39")),
            new FProduct(FOOD, "Peanut butter", new BigDecimal("2.39")),
            new FProduct(FOOD, "Red bell pepper", new BigDecimal("0.99")),
            new FProduct(UTENSILS, "Spoons", new BigDecimal("14.95")),
            new FProduct(OFFICE, "Adhesive tape", new BigDecimal("5.39")),
            new FProduct(CLEANING, "Dish brush", new BigDecimal("3.49")),
            new FProduct(UTENSILS, "Knives", new BigDecimal("9.95")),
            new FProduct(FOOD, "Brown bread", new BigDecimal("3.99")),
            new FProduct(FOOD, "Potatoes", new BigDecimal("1.59")),
            new FProduct(CLEANING, "Dishcloth", new BigDecimal("2.59")),
            new FProduct(FOOD, "Apples", new BigDecimal("1.29")),
            new FProduct(OFFICE, "Ballpoint pens", new BigDecimal("6.79")),
            new FProduct(FOOD, "Spaghetti", new BigDecimal("2.79")),
            new FProduct(UTENSILS, "Forks", new BigDecimal("14.95")),
            new FProduct(UTENSILS, "Paper towel", new BigDecimal("3.69")),
            new FProduct(FOOD, "Coffee", new BigDecimal("7.49")),
            new FProduct(OFFICE, "Highlighter", new BigDecimal("2.29")),
            new FProduct(FOOD, "Orange juice", new BigDecimal("3.49")),
            new FProduct(FOOD, "Spring water", new BigDecimal("0.99")));

    public static List<FProduct> getFProducts() {
        return new ArrayList<>(FProductS);
    }
}
