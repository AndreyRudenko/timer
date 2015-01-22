package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static int i = 5;

    public static void main(String[] args) {

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task №" + i);
                i++;
            }
        };
        Timer timer = new Timer();

        // старт через 1 секунду (1 секнуда = 1000 милисекнуд), повторять task каждые 2 секунды
        timer.schedule(task, 1000, 2000);


    }
}
