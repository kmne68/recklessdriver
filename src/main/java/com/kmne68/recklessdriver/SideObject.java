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
public class SideObject extends GameObject {

    public SideObject(int damage, int cash) {
        super();
        this.damage = damage;
        this.cash = cash;
        count = 0;
    }
    
    private int damage;
    private int cash;
    protected int count; // number of times a object has been in a collision

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
    
    
    
}
