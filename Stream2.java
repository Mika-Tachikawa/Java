package test55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamSample1 {
  public static void main(String[] args) {
    List<String> date = Arrays.asList("yamamoto", "kis", "sugiyama");
    
    List<String> result = new ArrayList<>();
    for (String s : date) {
      if (s.length() >= 5) {
        result.add(s);
      }
    }
    System.out.println(result);
  }
}