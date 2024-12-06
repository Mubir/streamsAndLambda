package oops.mubir.pls.strlmd;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

public class FunctionalInfCh5_3 {
    public static void main(String[] args) {
        List<FProduct> data = ExampleData.getFProducts();

        /**
         * Function<T, R>:
         *      Can have different types for input (T) and output (R).
         * UnaryOperator<T> and BinaryOperator<T>:
         *      The input and output types must be the same (T).
         *
         * Function:
         *      Used when the transformation from input to output
         *      involves changing the type.
         *
         * UnaryOperator:
         *      Used for operations where the input and output are
         *      of the same type.
         *
         * BinaryOperator:
         *      Used for operations involving two inputs of the same
         *      type and producing an output of the same type.
         *
         * */
        Optional<BigDecimal> sum = data.stream()
                .map(it -> it.getPrice())
                // reduce takes biConsumer
                .reduce((prev, current) -> prev.add(current));

        sum.ifPresentOrElse(
                System.out::println,
                () -> System.out.println(" Error ")
        );

        BigDecimal sumWithInitialValue =
                data.stream()
                        .map(it -> it.getPrice())
                        // reduce takes (initial,biConsumer)
                        .reduce(BigDecimal.ZERO, (prev, current) -> prev.add(current));


        System.out.println(sumWithInitialValue);

        BigDecimal sumIVNoMap =
                data.stream()
                        /** reduce takes (initial,function ,biConsumer)
                         *  function:: just current task.
                         * function will do the mapping
                         */
                        .reduce(BigDecimal.ZERO,
                                (it, itNext) -> it.add(itNext.getPrice()),
                                (prev, current) -> prev.add(current));


        System.out.println(sumIVNoMap);

    }
}
