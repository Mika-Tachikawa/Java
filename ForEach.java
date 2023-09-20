package test55;

import java.util.List;

public class ForEach {

  public static void main(String[] args){
    List<String> strs = List.of("apple","banana","grape");
    for (String str : strs) {
      System.out.println(str);
    }
  }
}