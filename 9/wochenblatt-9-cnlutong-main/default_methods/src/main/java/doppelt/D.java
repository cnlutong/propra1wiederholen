package doppelt;

public interface D {

  default String add(String s) {
    return "D"+s;
  }

}
