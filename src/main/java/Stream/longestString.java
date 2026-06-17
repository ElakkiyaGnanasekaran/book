package Stream;

import java.util.Arrays;
import java.util.*;

public class longestString {
    public static void main(String args[]){

    List<String> names = Arrays.asList("Java", "SpringBoot", "Microservices");

String longest = names.stream()
        .max(Comparator.comparing(String::length))
        .orElse("");

System.out.println(longest);
}
}
