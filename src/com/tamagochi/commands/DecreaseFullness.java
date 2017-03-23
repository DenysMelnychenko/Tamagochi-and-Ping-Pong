package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;
import com.tamagochi.threads.DecreaseStatsThread;

public class DecreaseFullness implements Command{
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public void execute() {
        int value = creature.getFullness() - DecreaseStatsThread.rnd(1, 10);
        creature.setFullness(value);
    }
}
