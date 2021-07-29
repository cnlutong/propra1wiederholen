package rechnung;

import org.javamoney.moneta.FastMoney;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Eine Rechnung")
public class RechnungTest {

  private static final Produkt MARMELADE =
      new Produkt("Marmelade", FastMoney.of(0.99, "EUR"));

  private static final Produkt RINDERHACK =
      new Produkt("500g Rinder Hackfleisch", FastMoney.of(2.29, "EUR"));


  @Test
  @DisplayName("sollte den Betrag 0 EUR haben, wenn es keine Positionen gibt")
  void test_leere_rechnung() {
    Rechnung rechnung = new Rechnung(new Customer("Dummy McDummyFace"));
    FastMoney rechnungsbetrag = rechnung.rechnungsbetrag();
    assertThat(rechnungsbetrag).isEqualTo(FastMoney.of(0,"EUR"));
  }

  @Test
  @DisplayName("sollte den Betrag 0.99 ausgeben, wenn ein Glas Marmelade gekauft wurde")
  void test_marmelade() {
    Rechnung rechnung = new Rechnung(new Customer("Dummy McDummyFace"));
    rechnung.positionHinzufuegen(MARMELADE,1);
    FastMoney rechnungsbetrag = rechnung.rechnungsbetrag();
    assertThat(rechnungsbetrag).isEqualTo(FastMoney.of(0.99, "EUR"));
  }

  @Test
  @DisplayName("sollte den Betrag 1.98 ausgeben, wenn zwei Gläser Marmelade gekauft wurden")
  void test_zwei_marmelade() {
    Rechnung rechnung = new Rechnung(new Customer("Dummy McDummyFace"));
    rechnung.positionHinzufuegen(MARMELADE,2);
    FastMoney rechnungsbetrag = rechnung.rechnungsbetrag();
    assertThat(rechnungsbetrag).isEqualTo(FastMoney.of(2 * 0.99, "EUR"));
  }

  @Test
  @DisplayName("sollte den Betrag 4.27 ausgeben, wenn zwei Gläser Marmelade und 500g Rinderhack gekauft wurden")
  void test_hack_und_marmelade() {
    //Rechnung rechnung = new Rechnung(Mockito.mock(Customer.class));
    Rechnung rechnung = new Rechnung(new Customer("Da JB"));
    rechnung.positionHinzufuegen(MARMELADE,2);
    rechnung.positionHinzufuegen(RINDERHACK,1);
    FastMoney rechnungsbetrag = rechnung.rechnungsbetrag();
    assertThat(rechnungsbetrag).isEqualTo(FastMoney.of(2 * 0.99 + 2.29, "EUR"));

  }

}
