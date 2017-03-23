package com.tamagochi.threads;

import com.tamagochi.commands.Command;
import com.tamagochi.holder.IncreaseCommandHolder;
import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

import java.util.Scanner;

public class IncreaseStatsThread implements Runnable {
    @Override
    public void run() {
        IncreaseCommandHolder holder = new IncreaseCommandHolder();
        Creature creature = Tamagochi.game.getCreature();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            synchronized (creature) {
                try {
                    String input = scanner.nextLine();
                    Command command = holder.get(input);
                    command.execute();
                    if (creature.getFullness() > 100) {
                        creature.setFullness(100);
                    } else if (creature.getVitality() > 100) {
                        creature.setVitality(100);
                    } else if (creature.getWc() < 0) {
                        creature.setWc(0);
                    }
                    System.out.println("Stats increased:");
                    System.out.println("Fullness = " + creature.getFullness()
                            + " Vitality = " + creature.getVitality() + " WC = " + creature.getWc()
                            + " Age = " + creature.getAge() + "\n");
                    creature.notify();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    System.out.println("Wrong input");
                } catch (NullPointerException e) {
                    System.out.println("Wrong input!");
                    System.out.println("Please retry...");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }
}
