package com.tamagochi.threads;

import com.tamagochi.commands.Command;
import com.tamagochi.holder.DecreaseCommandHolder;
import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

import java.util.concurrent.TimeUnit;

public class DecreaseStatsThread implements Runnable {

    @Override
    public void run() {
        Creature creature = Tamagochi.game.getCreature();
        DecreaseCommandHolder holder = new DecreaseCommandHolder();
        while (creature.getFullness() > 0
                && creature.getVitality() > 0 && creature.getWc() < 100) {

            try {
                TimeUnit.SECONDS.sleep(rnd(4, 15));
            } catch (InterruptedException e) {
                System.out.println("sleep() interrupted");
            }
            synchronized (creature) {
                Command command = holder.get(rnd(1, 3));
                command.execute();
                System.out.println("Stats decreased:");
                System.out.println("Fullness = " + creature.getFullness()
                        + " Vitality = " + creature.getVitality() + " WC = " + creature.getWc()
                        + " Age = " + creature.getAge() + "\n");
                creature.notify();
                Thread.yield();
            }
        }

        System.out.println("Game Over");
        System.out.println("You score is: " + creature.getAge());
        System.exit(0);
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
