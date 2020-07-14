package org.paolo;
 /*The purpose of the application is to help a fictitious company called Bills Burgers to manage
 their process of selling hamburgers.
 Our application will help Bill to select types of burgers, some of the additional items (additions) to
 be added to the burgers and pricing.
 We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
 The basic hamburger should have the following items.
 Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
 the customer can select to be added to the burger.
 Each one of these items gets charged an additional price so you need some way to track how many items got added
 and to calculate the final price (base burger with all the additions).
 This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
 Create a Hamburger class to deal with all the above.
 The constructor should only include the roll type, meat and price, can also include name of burger or you
 can use a setter.
 Also create two extra varieties of Hamburgers (subclasses) to cater for
 a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
 The healthy burger can have 6 items (Additions) in total.
 hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
 not the base class (Hamburger), since the two additions are only appropriate for this new class
 (in other words new burger type).
 b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
 hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
 object is created, and then prevent other additions being made.
  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
 plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
 burger (base price + all additions)
 For the two additional classes this may require you to be looking at the base class for pricing and then
 adding totals to final price.*/

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
