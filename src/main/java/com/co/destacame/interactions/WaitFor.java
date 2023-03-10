package com.co.destacame.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class WaitFor implements Interaction {
    private int seconds;

    public WaitFor(int seconds){this.seconds = seconds;}

    @Override
    public <T extends Actor>void performAs(T actor){
        try {
            Thread.sleep(seconds*1000);
            Thread.interrupted();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static WaitFor seconds(int seconds){return Tasks.instrumented(WaitFor.class, seconds);}
}
