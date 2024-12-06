package oops.mubir.pls.strlmd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctioalInfCh4_7 {
    public static void main(String[] args) {
        List<FProduct> data = ExampleData.getFProducts();

        List<String> pName = new ArrayList<>();

        /** this is violation of FP as manipulating outside var
         will create side effect and won't work for parallel stream.
         */
        data.stream()
                .filter(it -> it.getCategory() == Category.FOOD)
                .map(it -> it.getName())
                .forEach(it -> pName.add(it));

        System.out.println(" side effect ::  \n" + pName);

        List<String> pNameWithoutSideEffect = data.stream()
                .filter(it -> it.getCategory() == Category.FOOD)
                .map(it -> it.getName())
                .collect(Collectors.toList());
        System.out.println("no side effect ::  \n" + pNameWithoutSideEffect);

        String joinedName = data.stream()
                .filter(it -> it.getCategory() == Category.FOOD)
                .map(it -> it.getName())
                .collect(Collectors.joining(","));

        System.out.println("All name joined ::  \n" + joinedName);

        /**
         *  .map(FI:function)
         *  useage: extract (getXXX())
         *          manipulate ("\""+myString+"\"")
         * */
        String joinedCategory = data.stream()
                .map(it -> it.getCategory())
                .distinct()
                .map(it -> it.toString())
                .map(it -> "\"" + it + "\"")
                .collect(Collectors.joining(","));

        System.out.println("All category joined ::  \n" + joinedCategory);
    }
}
