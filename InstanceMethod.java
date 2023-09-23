package test55;

public class InstanceMethod {
  record Student(String name, int englishScore, int mathScore){}
  
  public static void main(String[] args){
    var kis = new Student("kis",60,80);
    var a = average(kis);
    System.out.println("平均点は%d点です".formatted(a));
  }
  
  static int average(Student s){
    return(s.englishScore()+s.mathScore())/2;
  }
}