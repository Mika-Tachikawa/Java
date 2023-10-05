package test55;

public class RunLengthCompression {
  public static void main(String[] args) {
    final var COUNTER_BASE = -1;
    var date = "abbcccbaaabccccccccccccddd";
    
    var count = COUNTER_BASE;
    char prev = 0;
    var builder = new StringBuilder();
    for (var ch : data.toCharArray()) {
      if (prev == ch) {
        //文字が同じだった場合
        count++;
        if(count == 9){
          builder.append('9');
          count = COUNTER_BASE;
          prev = 0;
        }
      }else {
        //文字が違った時
        if (count >= 0) {
          builder.append((char)('0'+count));
          count = COUNTER_BASE;
        }
        builder.append(ch);
        prev = ch;
      }
    }
    //最後の文字が連続していた場合数字を出力
    if (count >= 0){
      builder.append((char)('0'+count));
    }
    var result = builder.toString();
    System.out.println(date);
    System.out.println(result);
  }
}