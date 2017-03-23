package com.tamagochi.threads;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

/**
 * Created by Sony on 19.03.2017.
 */
public class IncreaseAgeThread implements Runnable {

    @Override
    public void run() {
        Creature creature = Tamagochi.game.getCreature();
        while (creature.getFullness() > 0
                && creature.getVitality() > 0 && creature.getWc() < 100) {
            {
                try {
                    Thread.sleep(60000);
                    creature.setAge(creature.getAge() + 1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
