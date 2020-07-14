package org.paolo;

public class Main {
  public static void main(String[] args) {
    /*per usare qeusto main decommentare a gruppi */

    /*primo hamburger. se si aggiunge un ingrediente restituisce impossibile perchè si superano il
    numero massimo di ingredienti previsti dall'esercizio. Così anche per le sottoclassi. In particolare Hamburger e
    DeluxeBurger prevedono un massimo di 4 aggiunte mentre HealthyBurger 6. Per aggiungere un ingrediente copiare e incollare
    una riga prima della scelta finale in ogni sottogruppo*/

    Hamburger hamburger = new Hamburger("White bread roll", "Cow meat", "Poldo", 4);
    hamburger.yourAddition("insalata", 1);
    hamburger.yourAddition("cetriolo", 2);
    hamburger.yourAddition("sottiletta", 3);
    hamburger.yourAddition("sottiletta", 3);
    // segue scelta finale
    hamburger.yourHamburger();

    //    Hamburger deluxeBurger = new DeluxeBurger("White roll", "Tzeuvre meat", "Il Furto", 19);
    //    deluxeBurger.yourAddition("insalata", 2);
    //    deluxeBurger.yourAddition("cetriolo", 2);
    //    deluxeBurger.yourAddition("sottiletta", 3);
    //    deluxeBurger.yourAddition("formaggio", 3);
    //    // segue scelta finale
    //    deluxeBurger.yourHamburger();

    //    Hamburger healthyBurger = new HealthyBurger("Tzeuvre meat", "Ingordo", 19);
    //    healthyBurger.yourAddition("insalata", 1);
    //    healthyBurger.yourAddition("cetriolo", 2);
    //    healthyBurger.yourAddition("sottiletta", 3);
    //    healthyBurger.yourAddition("formaggio", 3);
    //    healthyBurger.yourAddition("carciofo", 3);
    //    healthyBurger.yourAddition("wurstel", 3);
    //    // segue scelta finale
    //    healthyBurger.yourHamburger();
  }
}
