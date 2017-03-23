package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;
import com.tamagochi.threads.DecreaseStatsThread;

public class IncreaseWc implements Command {
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public void execute() {
        int value = creature.getWc() + DecreaseStatsThread.rnd(1, 12);
        creature.setWc(value);
    }
}
