import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

  public static void main(String[] args) {
    System.out.println(readFirstLineFromFile1("input.txt"));
    System.out.println(readFirstLineFromFile1("nichtda.txt"));
    System.out.println(readFirstLineFromFile2("input.txt"));
    System.out.println(readFirstLineFromFile2("nichtda.txt"));
  }

  static String readFirstLineFromFile1(String path) {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(path));
      return br.readLine();
    } catch (IOException e) {
      return "Es ist etwas schiefgelaufen beim Lesen";
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          // Nichts zu machen
        }
      }
    }
  }

  static String readFirstLineFromFile2(String path) {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      return br.readLine();
    }
    catch (IOException  e) {
      return "Es ist etwas schiefgelaufen beim Lesen";
    }
  }


}
