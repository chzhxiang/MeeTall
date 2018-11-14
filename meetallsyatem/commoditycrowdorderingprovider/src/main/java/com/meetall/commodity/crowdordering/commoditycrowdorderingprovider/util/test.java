package com.meetall.commodity.crowdordering.commoditycrowdorderingprovider.util;

import java.util.Timer;
import java.util.TimerTask;

public class test {


    /*timer.schedule(new TimerTask() {
        public void run() {
            System.out.println("11232");
        }
    }, 200000 , 1000);*/
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("11232");
            }
        },1000*10);
        System.out.println("Aaaaa");
    }
}
