package test55;

inport java.util.List;

public class Stream3 {
  public static void main(String[] args) {
    var date = List.of("yamamoto","kis","sugiyama");
    
    var result = 0;
    for (var s : date) {
      if (s.length() >= 5) {
        result++;
      }
      
    }
    System.out.println(result);
  } 
}