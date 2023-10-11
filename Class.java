package test55;

public class Class {
  static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return name;
    }

    public int getScore() {
      return score;
    }

    @Override
    public String toString() {
      return "Student{" +
             "name='" + name + '\'' +
             ", score=" + score +
             '}';
    }
  }

  public static void main(String[] args) {
    Student s = new Student("kis", 89);
    System.out.println(s);
  }
}
この修正では、通常のクラスStudentを使用し、コンストラクタ、アクセサーメソッド、toStringメソッドを追加して、同様の機能を実現しています。





