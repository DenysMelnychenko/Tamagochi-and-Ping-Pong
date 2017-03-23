package com.tamagochi.holder;

import com.tamagochi.commands.*;

import java.util.HashMap;

/**
 * Created by Sony on 18.03.2017.
 */
public class IncreaseCommandHolder {
    private HashMap<String, Command> holder = new HashMap<>();

    Command increaseVitalityCmd = new IncreaseVitality();
    Command increaseFullnessCmd = new IncreaseFullness();
    Command decreaseWcCmd = new DecreaseWc();

    public IncreaseCommandHolder() {
        holder.put("vit", increaseVitalityCmd);
        holder.put("ful", increaseFullnessCmd);
        holder.put("wc", decreaseWcCmd);
    }

    public Command get(String inputString) {
        Command command = holder.get(inputString);
        return command;
    }
}
