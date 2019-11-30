package com.winner.spring.bean.CD;

import org.springframework.stereotype.Component;

//@Component
public class NationCultureCD implements CompactDisc {

    private String title = "最炫民族风";
    private String content = "苍茫的天涯是我的爱";

    @Override
    public void play() {
        System.out.println("title:" + title + "\ncontent:" + content);
    }
}
