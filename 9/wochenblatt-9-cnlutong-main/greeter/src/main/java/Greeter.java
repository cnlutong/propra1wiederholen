import java.time.LocalDateTime;

public class Greeter {

  public void greet() {
    String greeting = "";
    int stunde = LocalDateTime.now().getHour();
    if (stunde >= 4 && stunde < 11) greeting = "Guten Morgen";
    if (stunde >= 11 && stunde < 14) greeting = "Mahlzeit";
    if (stunde >= 14 && stunde < 18) greeting = "Guten Tag";
    if (stunde >= 18 && stunde < 22) greeting = "Guten Abend";
    if (stunde >= 22 && stunde < 4) greeting = "Gute Nacht";
    System.out.println(greeting);
  }

  public static void main(String[] args) {
    new Greeter().greet();
  }


}
