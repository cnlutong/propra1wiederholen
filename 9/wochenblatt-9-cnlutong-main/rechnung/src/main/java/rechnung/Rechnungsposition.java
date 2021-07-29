package rechnung;

import org.javamoney.moneta.FastMoney;

public class Rechnungsposition {

  private final String produkt;
  private final int anzahl;
  private final FastMoney gesamtpreis;

  public Rechnungsposition(Produkt produkt, int anzahl) {
    this.produkt = produkt.getName();
    this.anzahl = anzahl;
    this.gesamtpreis = produkt.getPreis().multiply(anzahl);
  }

  public String getProdukt() {
    return produkt;
  }

  public int getAnzahl() {
    return anzahl;
  }

  public FastMoney getPositionPreis() {
    return gesamtpreis;
  }
}
