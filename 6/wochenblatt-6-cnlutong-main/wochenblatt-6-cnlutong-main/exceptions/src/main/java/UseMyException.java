public class UseMyException {




  public static void main(String[] args) {
    try {
      doTerribleStuff();
    } catch (MyException e) {
      e.printStackTrace();
    }
  }

  private static void doTerribleStuff() throws MyException {
    throw new MyException();
  }


}
