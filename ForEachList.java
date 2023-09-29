package test55;

import java.util.List;
import java.util.Arrays;

public class ForEachList {

  public static void main(String[] args) {
    List<String> strs = Arrays.asList("apple", "banana", "grape");
    for (String str : strs) {
      System.out.println(str);
    }
  }
}