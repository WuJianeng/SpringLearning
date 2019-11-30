package com.winner.spring.bean.config;

import com.winner.spring.bean.CD.BlankDisc;
import com.winner.spring.bean.CD.CompactDisc;
import com.winner.spring.bean.CD.NationCultureCD;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Configuration
public class CDConfig {
    @Bean
    @Primary
    @Qualifier("Nation")
    public CompactDisc getCompactDisc(){
        return new NationCultureCD();
    }

    @Bean
    @Qualifier("Foreign")
    public CompactDisc getAnotherCompactDisc(){
        return new BlankDisc("Nation", "Winner", Arrays.asList("Track1", "Track2", "Track3"));
    }
}
