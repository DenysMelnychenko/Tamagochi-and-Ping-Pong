package com.tamagochi.commands;

import com.tamagochi.main.Tamagochi;
import com.tamagochi.model.Creature;

/**
 * Created by Sony on 18.03.2017.
 */
public class IncreaseFullness implements Command {
    Creature creature = Tamagochi.game.getCreature();

    @Override
    public synchronized void execute() {
        int value = creature.getFullness() + 20;
        creature.setFullness(value);
    }
}
