package test55;

import java.util.List;

public class ForEachList {

  public static void main(String[] args) {
    var strs = List.of("apple","banana","grape");
    for (int i = 0; i < strs.size(); i++) {
      var str = strs.get(i);
      System.out.println(str);
    }
  }
  
}