package rechnung;

import java.util.ArrayList;
import java.util.List;
import org.javamoney.moneta.FastMoney;

public class Rechnung {
  private final Customer customer;
  private final List<Rechnungsposition> positionen = new ArrayList<>();

  public Rechnung(Customer kunde) {
    if (kunde == null) {
      throw new IllegalArgumentException("Kunde darf nicht null sein");
    }
    this.customer = kunde;
  }

  public void positionHinzufuegen(Produkt produkt, int anzahl) {
    positionen.add(new Rechnungsposition(produkt, anzahl));
  }

  public FastMoney rechnungsbetrag() {
    FastMoney betrag = FastMoney.of(0, "EUR");
    for (Rechnungsposition pos :positionen){
      betrag = betrag.add(pos.getPositionPreis());
    }
    return betrag;
  }
}
