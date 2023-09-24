package test55;

public class InstanceMethod {
  public static class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore) {
      this.name = name;
      this.englishScore = englishScore;
      this.mathScore = mathScore;
    }

    public String getName() {
      return name;
    }

    public int getEnglishScore() {
      return englishScore;
    }

    public int getMathScore() {
      return mathScore;
    }
  }

  public static void main(String[] args) {
    Student kis = new Student("kis", 60, 80);
    int a = average(kis);
    System.out.println("平均点は" + a + "点です");
  }

  static int average(Student s) {
    return (s.getEnglishScore() + s.getMathScore()) / 2;
  }
}






public class InstanceMethod {
  record Student(String name, int englishScore, int mathScore){}

    int average(){
      return (this.englishScore() + this.mathScore())/2;
    }
    
    public static void main(String[] args){
      var kis = new Student("kis",60,80);
      var a = kis.average();
      System.out.println("平均点は%d点です".formatted(a));
    }

}