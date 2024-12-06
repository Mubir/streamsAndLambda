package oops.mubir.pls.strlmd;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FunctionalInfCh5_5 {
    public static void main(String[] args) {

        List<FProduct> data = ExampleData.getFProducts();

        Map<Category, BigDecimal> totalCategory = data.stream()
                .collect(Collectors.toMap(
                        product -> product.getCategory(), // key
                        product -> product.getPrice(),    // value
                        // how values of map will  be combined
                        (price1, price2) -> price1.add(price2)
                ));

        System.out.println(totalCategory);

    }
}
