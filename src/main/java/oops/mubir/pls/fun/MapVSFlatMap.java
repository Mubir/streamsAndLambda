package oops.mubir.pls.fun;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVSFlatMap {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello world", "Java Streams", "FlatMap example");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
               // .flatMap(sentence -> sentence.split(" "))
                .collect(Collectors.toList());

        System.out.println(words);


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        // This will result in a stream of lists, not integers
        List<Stream<Integer>> streamOfStreams = listOfLists.stream()
                .map(List::stream)
                .collect(Collectors.toList());

        System.out.println(streamOfStreams);


        // Flatten the stream of lists into a single stream of integers
        List<Integer> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
