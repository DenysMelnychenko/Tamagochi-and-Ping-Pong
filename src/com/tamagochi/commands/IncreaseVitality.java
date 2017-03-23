package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

public class IncreaseVitality implements Command {
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public synchronized void execute() {
        int value = creature.getVitality() + 25;
        creature.setVitality(value);
    }
}
