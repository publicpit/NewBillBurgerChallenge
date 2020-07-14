package org.paolo;

public class DeluxeBurger extends Hamburger {
  private boolean chips;
  private boolean drink;
  private int chipsPrice;
  private int drinkPrice;

  // i boolean non servono ma li ho messi perchè in un app effettiva intuitivamente immagino
  // possano servire come flag

  public DeluxeBurger(String breadRoll, String meat, String name, int basePrice) {
    super(breadRoll, meat, name, basePrice);
    this.chips = true;
    this.drink = true;
    this.drinkPrice = 10;
    this.chipsPrice = 10;
  }

  public void yourMeal() {
    System.out.println(
        "This is deluxe hamburger meal  and it come with chips and drink.(see their price at the bottom)");
  }

  @Override
  public void yourHamburger() {
    yourMeal();
    super.yourHamburger();
  }

  @Override
  public void grandTotal() {
    System.out.println(
        "Chips and drink: $"
            + (chipsPrice + drinkPrice)
            + "\nTotal price of your meal is: "
            + (getTotalAdditionPrice() + getBasePrice() + chipsPrice + drinkPrice));
  }

  public int getChipsPrice() {
    return chipsPrice;
  }

  public int getDrinkPrice() {
    return drinkPrice;
  }
}
