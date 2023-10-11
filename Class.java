package test55;

public class Class {
  record Student(String name, int score) {}
  
  public static void main(String[] args) {
    var s = new Student("kis",89);
    System.out.println(s);
  }
}