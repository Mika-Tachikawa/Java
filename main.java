 // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理

class Main {
  public static void main(String[] args) {
    int number = 10;
      while(number > 0){
        System.out.println(number);
        number--;
      }
  }
}

class API {
    public static void main (String[] args) {
      System.out.println(java.time.LocalDate.now());
    }
}