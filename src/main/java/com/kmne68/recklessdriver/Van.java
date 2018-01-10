/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmne68.recklessdriver;

/**
 *
 * @author kemery
 */
public class Van extends TrafficCar {

    public Van(int damage, int cash) {
        super(damage, cash);
        setName("Van");
    }

    @Override
    public void OnCollision(GameObject other) {

        if (other.getName().equals("Player")) {
            Player player = (Player) other; // downcast 'other' to Player object

            System.out.println("### COLLISION -> [Van] Milk bottles flying");
            player.ApplyDamage(getDamage(), getCash());

        }
    }
}
