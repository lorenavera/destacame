package com.co.destacame.hooks;

import com.co.destacame.drivers.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Hook extends Driver {
    @Before
    public static void setUp() {

        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("actor");

    }

    @After
    public static void afterHook() {
        //theActorInTheSpotlight().attemptsTo(LogOut.theSession());
    }
}
