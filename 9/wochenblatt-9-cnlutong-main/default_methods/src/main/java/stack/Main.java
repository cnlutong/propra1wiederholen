package stack;

public class Main {

  public static void main(String[] args) {
    // LinkedListStack ist der Datei stacklib.jar als
    // class Datei vorhanden und darf nicht geändert werden
    MyStack<Integer> s = new LinkedListStack<>();
    s.push(1);
    s.pop();
    s.push(2);
    s.push(3);
    // Bringen Sie die folgende Zeile zum Laufen
    //  System.out.println(s.peek());
  }

}
