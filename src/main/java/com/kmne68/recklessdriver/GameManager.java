/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmne68.recklessdriver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kemery
 */
public class GameManager {

    private GameManager() {

    }

    static GameManager instance = new GameManager();

    public static GameManager getInstance() {
        return instance;
    }

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
        Scene scene = new Scene();
        scene.Start(player);

        // Loop through player driving/colliding
        while (player.IsAlive()) {

            // Generate gameobjects (sideobjects, traffic, etc)
            scene.GenerateNPCs();

            // Player drives car
            Drive();

            // Collide with other objects
            scene.Collide();

            // Repeat until health = 0
        }
        EndGame();
    }

    private void Drive() {

        System.out.println("\nPlayer is driving the car.");

        for (int i = 0; i < 10; ++i) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("");
    }

    public void EndGame() {
        System.out.printf("Total cash accumulated : %d", cash);
    }
}
