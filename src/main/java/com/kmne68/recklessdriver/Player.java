/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmne68.recklessdriver;

/**
 *
 * @author kemery
 * 
 * Manage player vehicle
 */
public class Player extends GameObject {
    
    private int health;
    private PlayerVehicle vehicle;
    
    public Player(int health, PlayerVehicle vehicle) {
        super();
        
        this.health = health;
        this.vehicle = vehicle;
        setName("Player");
        
    }
    
    public boolean IsAlive() {
        return health > 0;
    }
    
    public void ApplyDamage(int damage, int cash) {
        health -= damage - vehicle.getStrength();        
        System.out.printf("Player health: %d\n", health < 0 ? 0 : health);
        GameManager.getInstance().AddCash(cash);
    }
    
    public void Accelerate() {
        vehicle.Up();
    }
    
    public void Break() {
        vehicle.Down();
    }
    
    public void SteerLeft() {
        vehicle.Left();
    }
    
    public void SteerRight() {
        vehicle.Right();
    }
    
}
