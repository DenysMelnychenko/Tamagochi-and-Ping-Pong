package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;
import com.tamagochi.threads.DecreaseStatsThread;

public class DecreaseVitality implements Command {
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public void execute() {
        int value = creature.getVitality() - DecreaseStatsThread.rnd(1, 15);
        creature.setVitality(value);
    }
}
