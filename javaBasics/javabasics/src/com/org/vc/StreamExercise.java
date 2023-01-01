package com.org.vc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamExercise {

    public static void main(String[] args) {

        // Sort array in reverse order
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).toList());

        // Join list of string using delimiter
        List<String> stringList1 = Arrays.asList("Welcome", "to", "TechGeekNext");
        String joinStr = stringList1.stream().collect(Collectors.joining("-"));
        System.out.println(" Join list of String using stream" + joinStr);

        // get repeated string from ArrayList
        List<String> stringList2 = Arrays.asList("aa", "bb", "aa");
        Map<Object, Long> map = stringList2.stream()
                .collect(groupingBy(Function.identity(),counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

    }
}
