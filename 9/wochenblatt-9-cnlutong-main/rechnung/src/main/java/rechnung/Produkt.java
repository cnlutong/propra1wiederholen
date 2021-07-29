package rechnung;

import org.javamoney.moneta.FastMoney;

public class Produkt {
  private final String name;
  private final FastMoney preis;

  public Produkt(String name, FastMoney preis) {
    this.name = name;
    this.preis = preis;
  }

  public String getName() {
    return name;
  }

  public FastMoney getPreis() {
    return preis;
  }
}

