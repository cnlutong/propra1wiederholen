import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CheckedExcption {

//  public static void printQuote() {
//    Files.lines(Path.of("input.txt")).forEach(System.out::println);
//  }


  public static void printQuote() throws IOException {
    Files.lines(Path.of("input.txt")).forEach(System.out::println);
  }


  public static void main(String[] args)  {
    try {
      printQuote();
    } catch (IOException e) {
      System.out.println("¯\\_(ツ)_/¯");
    }
  }


}
