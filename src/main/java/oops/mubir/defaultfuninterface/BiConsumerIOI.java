package oops.mubir.defaultfuninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerIOI {

    static BiConsumer<List<Integer>, List<Integer>> equalCheck = (first, second) -> {
        if (first.size() != second.size()) {
            System.out.println("Not equal");
        }
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i) == second.get(i))
                System.out.println("Not equal");
        }
    };

    static BiConsumer<List<Integer>, List<Integer>> print = (first, second) -> {
        for (int i = 0; i < first.size(); i++) {
            System.out.println(first.get(i) + "->" + second.get(i));
        }
    };

    public static void main(String[] args) {
        List<Integer> key = new ArrayList<Integer>();
        key.add(1);
        key.add(2);
        key.add(3);

        List<Integer> value = new ArrayList<Integer>();
        value.add(555);
        value.add(666);
        value.add(888);

        equalCheck.andThen(print).accept(key, value);
    }
}
