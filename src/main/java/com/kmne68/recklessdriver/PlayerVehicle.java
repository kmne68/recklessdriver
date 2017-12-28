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
public class PlayerVehicle {
    
    private String name;
    private int handling;
    private int topSpeed;
    private int strength;

    public PlayerVehicle(String name, int handling, int topSpeed, int strength) {
        this.name = name;
        this.handling = handling;
        this.topSpeed = topSpeed;
        this.strength = strength;
    }
    
    

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getHandling() {
        return handling;
    }

    private void setHandling(int handling) {
        this.handling = handling;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    private void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }
    
    public void Up() {
        
    }
    
    public void Down() {
        
    }
    
    public void Right() {
        
    }
    
    public void Left() {
        
    }
    
}
