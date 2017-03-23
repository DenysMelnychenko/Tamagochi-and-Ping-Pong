package com.tamagochi.model;

import com.tamagochi.threads.DecreaseStatsThread;
import com.tamagochi.threads.IncreaseAgeThread;
import com.tamagochi.threads.IncreaseStatsThread;

import java.util.Scanner;

public class Game {

    private  Creature creature = new Creature();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        Thread decreaseThread = new Thread(new DecreaseStatsThread());
        Thread increaseThread = new Thread(new IncreaseStatsThread());
        Thread increaseAge = new Thread(new IncreaseAgeThread());
        System.out.println("Type go to start the game");
        String scan = scanner.nextLine();
        if (scan.equals("go")) {
            System.out.println("Game start");
            increaseAge.start();
            decreaseThread.start();
            increaseThread.start();
        } else if (!scan.equals("go")) {
            System.out.println("Please, start the game");
        }
    }
    public void printRule() {
        System.out.println("RULES:");
        System.out.println("To increase creature Vitality type - vit");
        System.out.println("To increase creature Fullness type - ful");
        System.out.println("To decrease creature WC type - wc" + "\n");
    }

    public Creature getCreature() {
        return this.creature;
    }


}
