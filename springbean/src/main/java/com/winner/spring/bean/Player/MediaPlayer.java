package com.winner.spring.bean.Player;

import com.winner.spring.bean.CD.CompactDisc;

public interface MediaPlayer {
    void setContent(CompactDisc cd);

    void play();
}
