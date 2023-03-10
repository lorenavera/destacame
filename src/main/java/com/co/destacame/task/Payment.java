package com.co.destacame.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static com.co.destacame.userinterfaces.MainUI.*;

public class Payment implements Task {

    public static Payment Product(){
        return Tasks.instrumented(Payment.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(BUTTON_CONTINUE_PAY));
        System.out.println("Se realiza la compra");
    }
}
