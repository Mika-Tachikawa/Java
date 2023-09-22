//package test55;

//import java.util.ArrayList;
//import java.util.List;

//public class Stream {
  //public static void main(String[] args){
    //var date = List.of("yamamoto","kis","sugiyama");
    //var result = new ArrayList<String>();
    //for(var s : date){
      //if(s.length()>=5){
        //result.add(s);
      //}
    //}
    //System.out.println(result);
  //}
//}




package test55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
  public static void main(String[] args){
    List<String> date = Arrays.asList("yamamoto", "kis", "sugiyama");
    List<String> result = new ArrayList<String>();
    for(String s : date){
      if(s.length() >= 5){
        result.add(s);
      }
    }
    System.out.println(result);
  }
}