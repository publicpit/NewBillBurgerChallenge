package org.paolo;

public class Hamburger {

  private String breadRoll;
  private String meat;
  private String name;
  private String ingredient = "";
  private String ingredientAndPrice = "";

  private int basePrice;
  private int priceIngredient;
  private int totalAdditionPrice;
  private int countAddition = 0;

  public Hamburger(String breadRoll, String meat, String name, int basePrice) {
    this.breadRoll = breadRoll;
    this.meat = meat;
    this.name = name;
    this.basePrice = basePrice;
  }

  public int getMaximumAddition() {
    return 4;
  }

  public void yourHamburger() { // riassume l'hamburger scelto
    if (getCountAddition() > getMaximumAddition()) {
      //      do nothing -- non saprei se posso lasciarlo vuoto ma mi veniva comodo
    } else {
      System.out.println("Your hamburger is the " + "\"" + getName() + "\"" + " composed as: ");
      System.out.println(" - " + getBreadRoll());
      System.out.println(" - " + getMeat());

      System.out.println("with along the following addition: " + getIngredient());
      System.out.println("The base price of your hamburger is: $" + getBasePrice() + ". ");
      System.out.println(
          "In your choice total price of your additions \n ("
              + getIngredientAndPrice()
              + " \n ): \nAddition total: $"
              + getTotalAdditionPrice());
      grandTotal();
    }
  }

  // controlla il numero di aggiunte e la compatibilità con i vincoli dettati dall'esercizio.
  // Inoltr setta le stringhe che servono al metodo yourHamburger()
  public void yourAddition(String otherIngredient, int priceIngredient) {
    this.priceIngredient = priceIngredient;
    incrementCountAddition();
    countTotalAdditionPrice(priceIngredient);
    if (getCountAddition() > getMaximumAddition()) {
      System.out.println(
          "You cannot choose more than " + getMaximumAddition() + " for that hamburger");
      ;
    } else {
      this.ingredientAndPrice += "\n - " + otherIngredient + " $" + getPriceIngredient();
      this.ingredient += "\n - " + otherIngredient;
    }
  }

  public void grandTotal() {
    System.out.println(
        "Total price of your meal is: " + (getTotalAdditionPrice() + getBasePrice()));
  }

  public void incrementCountAddition() {
    this.countAddition++;
  }

  // questo metodo serve per il metodo yourAddition().
  // Il getter che segue serve poi per usarlo senza parametro
  public void countTotalAdditionPrice(int priceIngredient) {
    this.totalAdditionPrice += priceIngredient;
  }

  public int getTotalAdditionPrice() {
    return this.totalAdditionPrice;
  }

  // seguono i vari getter
  public String getIngredient() {
    return this.ingredient;
  }

  public String getIngredientAndPrice() {
    return this.ingredientAndPrice;
  }

  public String getBreadRoll() {
    return this.breadRoll;
  }

  public String getMeat() {
    return this.meat;
  }

  public String getName() {
    return this.name;
  }

  public int getBasePrice() {
    return this.basePrice;
  }

  public int getCountAddition() {
    return this.countAddition;
  }

  public int getPriceIngredient() {
    return this.priceIngredient;
  }

  public String additionAndPrice() {
    return this.ingredientAndPrice;
  }
}
