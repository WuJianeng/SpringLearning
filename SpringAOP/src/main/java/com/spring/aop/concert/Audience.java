package com.spring.aop.concert;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

//    @Bean
//    public Audience getAudience(){
//        return new Audience();
//    }

    @Pointcut("execution(* com.spring.aop.concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Audience: Silence cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Audiences: Taking seats.");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("Audiences: CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Audience: Demanding a refund");
    }
}
