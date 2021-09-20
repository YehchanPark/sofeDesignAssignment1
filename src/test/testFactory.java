package test;

import Assign1.*;


public class testFactory {
    public static void main(String[] args) {
        sodaFactory sodas = new sodaFactory();
        waterFactory waters = new waterFactory();

        soda pepsi1 = (soda) sodas.createBottleA();
        System.out.println("The price of pepsi is " + pepsi1.getPrice());

        soda fanta1 = (soda) sodas.createBottleB();
        System.out.println("The price of fanta is " + fanta1.getPrice());

        water dasani1 = (water) waters.createBottleA();
        System.out.println("The price of dasani is " + dasani1.getPrice());

        water smart1 = (water) waters.createBottleB();
        System.out.println("The price of Smart water is " + smart1.getPrice());

        soda pepsi2 = (soda) sodas.createBottleA();
    }
}
