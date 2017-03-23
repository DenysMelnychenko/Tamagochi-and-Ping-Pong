package com.tamagochi.threads;

import com.tamagochi.main.PingPong;
import com.tamagochi.model.Ball;

public class PingThread implements Runnable {
    @Override
    public void run() {
        Ball ball = PingPong.ball;

        while (true) {
            synchronized (ball) {
                System.out.println(ball.getPing());
                ball.notify();
                try {
                    ball.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
