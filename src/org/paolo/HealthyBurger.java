package org.paolo;

public class HealthyBurger extends Hamburger {

  // questo panino può avere 6 aggiunte e solo pane del tipo Brown
  public HealthyBurger(String meat, int basePrice) {
    super("Brown rye bread", meat, "Healthy burger", basePrice);
  }

  @Override
  public int getMaximumAddition() {
    return 6;
  }
}
