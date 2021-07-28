public class ArrayDivision {

  public static void div(int[] zaehler, int[] nenner) {
    for (int i = 0; i < zaehler.length; i++) {
      System.out.println(zaehler[i] / nenner[i]);
    }
  }

  public static void divCatch(int[] zaehler, int[] nenner) {
    for (int i = 0; i < zaehler.length; i++) {
      try {
        System.out.println(zaehler[i] / nenner[i]);
      }
      catch (ArithmeticException e) {
        System.out.println("Nicht durch 0 teilen!");
      }
    }
  }

  public static void main(String[] args) {
    int[] z = {20, 15, 8, 58};
    int[] n = {5, 3, 0, 29};
    divCatch(z, n);
  }

}
