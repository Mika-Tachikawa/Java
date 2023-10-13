package test55;

import java.util.ArrayList;
import java.util.List;

public class Inherit {
  static class User {
    String name;
    
    public String getName() {
      return name;
    }
  }
  
  static class Student extends User {
    int score;
    
    Student(String name, int score){
      this.name = name;
      this.score = score;
    }
    
    public int getScore(){
      return score;
    }
  }
  
  static class Teacher extends User {
    String subject;
    
    Teacher(String name, String subject) {
      this.name = name;
      this.subject = subject;
    }
    
    public String getSubject() {
      return subject;
    }
  }
  
  public static void main(String[] args) {
    List<User> people = new ArrayList<>();
    people.add(new Student("kis", 80));
    people.add(new Teacher("hosoya", "Math"));
    for (User p : people) {
      System.out.println(String.format("こんにちは%sさん", p.getName()));
    }
  }
}