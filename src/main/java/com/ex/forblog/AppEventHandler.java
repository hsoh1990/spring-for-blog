package com.ex.forblog;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AppEventHandler {

    @EventListener
    @Async
    public void handle(AppEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("AppEventHandler = " +event.getData());
    }
}
