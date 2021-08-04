package de.hhu.propra.streams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambada {
    public static void main(String[] args) throws IOException {
//        IntStream.range(1, 10)
//                .map(i -> i * i)
//                .filter(i -> i % 2 == 0)
//                .forEach(System.out::println);
//
//        List<String> config = Files.readAllLines(Paths.get("my_config.yml"));
//        Map<String,String> configMap = config.stream().collect(
//                // TODO: collect implementieren
//                null, // Supplier
//                null, // Accumulator
//                null // Combiner
//            );
//        System.out.println(configMap);

        List<String> config1 = Files.readAllLines(Paths.get("studis.txt"));
        Map<String, List<String[]>> collect = config1.stream().map(s -> s.split(" ")).collect(Collectors.groupingBy(arr -> arr[2]));;
        System.out.println(collect);
    }
}
