package com.winner.spring.bean.config;

import com.winner.spring.bean.CD.CompactDisc;
import com.winner.spring.bean.Player.CDPlayer;
import com.winner.spring.bean.CD.NationCultureCD;
import com.winner.spring.bean.Player.MediaPlayer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class CDPlayerConfig {

    @Bean
    @Qualifier("Good")
    public CDPlayer getMediaPlayer(CompactDisc cd){
        MediaPlayer player =  new CDPlayer();
        player.setContent(cd);
        return (CDPlayer) player;
    }
}
