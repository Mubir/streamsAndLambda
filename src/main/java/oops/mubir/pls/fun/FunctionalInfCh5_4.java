package oops.mubir.pls.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInfCh5_4 {
    /**
     * 1 . reduce() works on immutable where as
     * collect() works on mutable.
     */
    public static void main(String[] args) {

        List<FProduct> data = ExampleData.getFProducts();

        List<String> prouctname = data.stream()
                .reduce(
                        new ArrayList<>(), // concrete object
                        (list, porduct) -> {
                            // as need immuatable so need to create new list.
                            ArrayList<String> newList = new ArrayList<>(list);
                            newList.add(porduct.getName());
                            return newList;
                        },
                        (oldListTotal, newIntermediateList) ->
                        {
                            ArrayList<String> resultantList = new ArrayList<>(oldListTotal);
                            resultantList.addAll(newIntermediateList);
                            return resultantList;
                        }
                );

        List<String> product = data.stream().collect(
                ArrayList::new,// its a supplier,
                (list, porduct) -> list.add(porduct.getName()),
                (oldListTotal, newIntermediateList) -> oldListTotal.addAll(newIntermediateList)
        );
    }
}
