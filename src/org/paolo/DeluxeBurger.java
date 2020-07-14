package org.paolo;

public class DeluxeBurger extends Hamburger {

  public DeluxeBurger() {
    super("White", "Sausage", "Deluxe", 14.5);
    super.yourAddition("chips", 2.5);
    super.yourAddition("drink", 4);
  }

  @Override
  public int getMaximumAddition() {
    return 6;
  }
}
