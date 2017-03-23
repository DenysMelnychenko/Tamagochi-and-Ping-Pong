package com.tamagochi.main;
import com.tamagochi.model.Game;

public class Tamagochi {
   public static volatile Game game = new Game();

    public static void main(String[] args) {
        game.printRule();
        game.start();
    }
}
