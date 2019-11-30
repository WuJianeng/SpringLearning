package com.winner.spring.bean;

import com.winner.spring.bean.CD.CompactDisc;
import com.winner.spring.bean.Player.MediaPlayer;
import com.winner.spring.bean.config.SoundSystemConfig;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    @Qualifier("Foreign")
    private CompactDisc cd;

    @Autowired
    @Qualifier("Good")
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        System.out.println("This is CD.");
        cd.play();
    }

    @Test
    public void testMediaPlayer(){
        assertNotNull(mediaPlayer);
        System.out.println("This is CD Player.");
        mediaPlayer.play();
    }
}
