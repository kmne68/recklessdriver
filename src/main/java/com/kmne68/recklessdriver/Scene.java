/*
 * Responsible for representing the scene (houses, trees, etc.)
 * generates NPCs (vehicles and side objects). Simulate collision between 
 * the player and NPCs.
 */
package com.kmne68.recklessdriver;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kemery
 */
public class Scene {

    private static final int TOTAL_SIDEOBJECTS = 2;
    private static final int TOTAL_TRAFFIC = 2;

    private ArrayList<TrafficCar> trafficList = new ArrayList();
    private ArrayList<SideObject> sideList = new ArrayList();

    private Player player;
    private Random random = new Random();

    public void Start(Player player) {
        this.player = player;
    }

    public void GenerateNPCs() {

        sideList.add(GenerateSideObject());
        trafficList.add(GenerateTraffic());
        DisplaySideObjects();
        DisplayTraffic();

    }

    private SideObject GenerateSideObject() {
        switch (random.nextInt(TOTAL_SIDEOBJECTS)) {
            case 0: // Firehydrant
                return new FireHydrant(5, 10);
            case 1: // Letterbox
                return new LetterBox(3, 15);

        }
        return null;
    }

    private TrafficCar GenerateTraffic() {
        switch (random.nextInt(TOTAL_TRAFFIC)) {
            case 0: // Sedan
                return new Sedan(15, 80);
            case 1: // Van
                return new Van(18, 90);
        }
        return null;
    }

    private void DisplaySideObjects() {
        System.out.println("<<<<<<<<SIDEOBJECTS>>>>>>>");
        for (SideObject obj : sideList) {
            System.out.println(obj.getName());
        }
    }

    private void DisplayTraffic() {
        System.out.println("<<<<<<<<TRAFFIC>>>>>>>");
        for (TrafficCar obj : trafficList) {
            System.out.println(obj.getName());
        }
    }
}
