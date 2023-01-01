package vc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindMaxRepeatedChar {

    public static void main(String[] args) {

         System.out.println("First Non Repeated Char :" + "loveleetcode".chars().mapToObj(s -> (char) s)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst().get());

        System.out.println("First Repeated Char :" + "loveleetcode".chars().mapToObj(s -> (char) s)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst().get());

        System.out.println("Max Repeated Char :"+"loveleetcode".chars().mapToObj(s -> (char)s)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(e -> e.getKey()).get());

    }
}
