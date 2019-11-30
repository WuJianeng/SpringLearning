package com.winner.spring.bean.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
//@Import( CDPlayerConfig.class)
//@ImportResource({"classpath:CDConfig.xml", "classpath:cdPlayer-config.xml"})
@Import(CDConfig.class)
@ImportResource("classpath:cdPlayer-config.xml")
public class SoundSystemConfig {

}
