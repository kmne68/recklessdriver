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
public class GameManager {
    
    private int cash;
    
    public int GetCash() {
        return cash;
    }
    
    public void AddCash(int amount) {
        cash += amount;
    }
    
    public void NewGame() {
        // Choose vehicle
        PlayerVehicle vehicle = new PlayerVehicle("Sedan", 5, 70, 4);

        // Create a player object
        Player player = new Player(100, vehicle);
        player.setName("Player");
        
        // Prepare the scenery
        // Loop through player driving/colliding
        while(player.IsAlive()){
            // Generate gameobjects (sideobjects, traffic, etc)
            // Collide with other objects
            // Repeat until health = 0
        }
    }
    
    public void EndGame() {
        System.out.printf("Total cash accumulated : %d", cash);
    }
}
