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
public class Sedan extends TrafficCar {

    public Sedan(int damage, int cash) {
        super(damage, cash);
    }    
    
    
    /**
     *
     * @param other
     */
    @Override
    public void OnCollision(GameObject other) {
        super.OnCollision(other);
    }
}
