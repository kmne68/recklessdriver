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
public class FireHydrant extends SideObject {

    public FireHydrant(int damage, int cash) {
        super(damage, cash);
        setName("Fire Hydrant");
    }

    @Override
    public void OnCollision(GameObject other) {
        
        if(other.getName().equals("Player")) {
            Player player = (Player)other; // downcast 'other' to Player object
            
            if(count == 0) {
                System.out.println("### COLLISION -> [FireHydrant] Fountain");
                player.ApplyDamage(getDamage(), getCash());
            } else {
                System.out.println("### COLLISION -> [FireHydrant] Collided again");
                player.ApplyDamage(getDamage(), getCash() * count);
            }
        }
    }
    
    
}
