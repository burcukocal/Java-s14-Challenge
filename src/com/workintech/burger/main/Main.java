package com.workintech.burger.main;

import com.workintech.burger.model.BreadRollType;
import com.workintech.burger.model.DeluxeBurger;
import com.workintech.burger.model.Hamburger;
import com.workintech.burger.model.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----company------");

        Hamburger hamburger = new Hamburger("Basic", 3.56, BreadRollType.WRAP);
        hamburger.addAddition("Tomato", 0.27);
        hamburger.addAddition("Lettuce", 0.75);
        hamburger.addAddition("Cheese", 1.13);
        hamburger.itemizeHamburger();

        System.out.println("-----healty------");
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);
        healthyBurger.addAddition("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        System.out.println("-----deluxe------");
        DeluxeBurger db = new DeluxeBurger();
        db.addAddition("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}