package test55;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> date = Arrays.asList("yamamoto", "kis", "sugiyama");

        long result = date.stream()
                .filter(s -> s.length() >= 5)
                .count();

        System.out.println(result);
    }
}