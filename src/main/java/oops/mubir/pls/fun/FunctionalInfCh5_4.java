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

        // consumer can make mutable list
        // if function means immutable.
        List<String> product = data.stream().collect(
                ArrayList::new,// its a supplier,
                (list, porduct) -> list.add(porduct.getName()),
                /**
                 *  this combiner is important in case of parallel stream
                 *  which combines 2 result container from different thread.
                 * */
                (oldListTotal, newIntermediateList) -> oldListTotal.addAll(newIntermediateList)
        );
    }
}
