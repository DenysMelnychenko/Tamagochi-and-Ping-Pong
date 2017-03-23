package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

public class DecreaseWc implements Command {
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public synchronized void execute() {
        int value = creature.getWc() - 15;
        creature.setWc(value);
    }
}
