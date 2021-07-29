package rechnung;

public final class Customer {

  private final String name;

  public Customer(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Der Name darf nicht null oder leer sein.");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
