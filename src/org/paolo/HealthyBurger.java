package org.paolo;

public class HealthyBurger extends Hamburger {

  // questo panino può avere 6 aggiunte e solo pane del tipo Brown
  public HealthyBurger(String meat, String name, int basePrice) {
    super("Brown rye bread", meat, name, basePrice);
  }

  @Override
  public int getMaximumAddition() {
    return 6;
  }
}
