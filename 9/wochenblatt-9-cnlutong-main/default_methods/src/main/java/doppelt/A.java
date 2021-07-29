package doppelt;

public interface A {

  default String add(String s) {
    return "A"+s;
  }

}
