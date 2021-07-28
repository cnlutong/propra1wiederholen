public class FinallyBlock {

  public static void main(String[] args) {
    kaputt(3);
    kaputt(0);
    kaputt(5);
  }

  private static void kaputt(int n) {
    try {
      System.out.println(100 / n);
    }
    finally {
      System.out.println("Ich werde immer ausgeführt! n="+n);
    }
  }


}
