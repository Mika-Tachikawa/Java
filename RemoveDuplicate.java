package test55;

public class RemoveDuplicate {
  public static void main(String[] args) {
    var date = "abcccbaabcc";
    var builder = new StringBuilder();
    for (int i = 0; i < date.length(); i++) {
      char ch = date.charAt(i);
      if (i > 0 && ch == date.charAt(i-1)) {
        continue;
      }
      builder.append(ch);
    }
    var result = builder.toString();
    System.out.println(date);
    System.out.println(result);
  }
}