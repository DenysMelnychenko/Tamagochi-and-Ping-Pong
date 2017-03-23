package com.tamagochi.holder;

import com.tamagochi.commands.Command;
import com.tamagochi.commands.DecreaseFullness;
import com.tamagochi.commands.DecreaseVitality;
import com.tamagochi.commands.IncreaseWc;

import java.util.HashMap;

public class DecreaseCommandHolder {

    private HashMap<Integer, Command> holder = new HashMap<>();

    Command decreaseVitalityCmd = new DecreaseVitality();
    Command decreaseFullnessCmd = new DecreaseFullness();
    Command increaseWcCmd = new IncreaseWc();

    public DecreaseCommandHolder() {
        holder.put(1, decreaseFullnessCmd);
        holder.put(2, decreaseVitalityCmd);
        holder.put(3, increaseWcCmd);
    }

    public Command get(Integer inputNumber) {
        Command command = holder.get(inputNumber);
        return command;
    }
}
