public class MultiCatch {


  public static void main(String[] args) {

    kaboom2();


  }

  private static void kaboom1() {
    try {
      if (Math.random() > 0.5) {
        throw new NullPointerException("(╯°□°）╯︵ ┻━┻) ");
      }
      else {
        throw new ArrayIndexOutOfBoundsException("¯\\_(ツ)_/¯");
      }
    } catch (NullPointerException e1) {
      System.out.println(e1.getMessage());
      ;
    } catch (ArrayIndexOutOfBoundsException e2) {
      System.out.println(e2.getMessage());
    }
  }

  private static void kaboom2() {
    try {
      if (Math.random() > 0.5) {
        throw new NullPointerException("(╯°□°）╯︵ ┻━┻) ");
      }
      else {
        throw new ArrayIndexOutOfBoundsException("¯\\_(ツ)_/¯");
      }
    } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }


}
