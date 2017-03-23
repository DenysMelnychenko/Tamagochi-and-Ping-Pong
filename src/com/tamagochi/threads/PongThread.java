package com.tamagochi.threads;

import com.tamagochi.main.PingPong;
import com.tamagochi.model.Ball;

import static java.lang.System.out;

public class PongThread implements Runnable {
    @Override
    public void run() {
        Ball ball = PingPong.ball;

        while (true) {
            synchronized (ball) {
                out.println(ball.getPong());
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
