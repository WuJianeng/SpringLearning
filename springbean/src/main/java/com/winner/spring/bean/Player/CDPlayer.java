package com.winner.spring.bean.Player;

import com.winner.spring.bean.CD.CompactDisc;
import org.springframework.stereotype.Component;

//@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(){}

    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void setCd(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void setContent(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
