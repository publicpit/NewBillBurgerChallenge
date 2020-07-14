package org.paolo;

public class Hamburger {

  private String breadRoll;
  private String meat;
  private String name;
  private String ingredient = "";
  private String ingredientAndPrice = "";

  private double basePrice;
  private double priceIngredient;
  private double totalAdditionPrice;
  private double countAddition = 0;

  public Hamburger(String breadRoll, String meat, String name, double basePrice) {
    this.breadRoll = breadRoll;
    this.meat = meat;
    this.name = name;
    this.basePrice = basePrice;
  }

  public int getMaximumAddition() {
    return 4;
  }

  public void yourHamburger() { // riassume l'hamburger scelto
    if (countAddition > getMaximumAddition()) {
      //      do nothing -- non saprei se posso lasciarlo vuoto ma mi veniva comodo
    } else {
      System.out.println("Your hamburger is the " + "\"" + this.name + "\"" + " composed as: ");
      System.out.println(" - " + this.breadRoll);
      System.out.println(" - " + this.meat);

      System.out.println("with along the following addition: " + this.ingredient);
      System.out.println("The base price of your hamburger is: $" + this.basePrice + ". ");
      System.out.println(
          "In your choice total price of your additions \n ("
              + this.ingredientAndPrice
              + " \n ): \nAddition total: $"
              + this.totalAdditionPrice);
      grandTotal();
      System.out.println("\n");
    }
  }

  // controlla il numero di aggiunte e la compatibilità con i vincoli dettati dall'esercizio.
  // Inoltr setta le stringhe che servono al metodo yourHamburger()
  public void yourAddition(String otherIngredient, int priceIngredient) {
    this.priceIngredient = priceIngredient;
    this.totalAdditionPrice += priceIngredient;
    countAddition++;
    if (this.countAddition > getMaximumAddition()) {
      System.out.println(
          "You cannot choose more than " + getMaximumAddition() + " for that hamburger");
      ;
    } else {
      this.ingredientAndPrice += "\n - " + otherIngredient + " $" + priceIngredient;
      this.ingredient += "\n - " + otherIngredient;
    }
  }

  public void grandTotal() {
    System.out.println("Total price of your meal is: " + (totalAdditionPrice + basePrice));
  }

  public double getTotalAdditionPrice() {
    return this.totalAdditionPrice;
  }

  // seguono i vari getter

  public double getBasePrice() {
    return this.basePrice;
  }
}
