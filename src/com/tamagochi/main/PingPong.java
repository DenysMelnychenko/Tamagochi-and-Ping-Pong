package com.tamagochi.main;

import com.tamagochi.model.Ball;
import com.tamagochi.threads.PingThread;
import com.tamagochi.threads.PongThread;

public class PingPong {
   public volatile static Ball ball = new Ball();
    public static void main(String[] args) {
        Thread ping = new Thread(new PingThread());
        Thread pong = new Thread(new PongThread());
        ping.start();
        pong.start();
    }
}
