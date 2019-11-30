package com.spring.aop.concert;

import java.util.Random;

public class MusicPerformance implements Performance {

    private String theme = "Classic Music";

    public void perform() {
        System.out.println("Theme: " + theme + "Music Performance is beginning!");
        if(new Random().nextInt(100) + 1 == 1)
            throw new IllegalArgumentException("Music Performance is stopped casually!");
        System.out.println("Music Performance is ending!");
    }
}
