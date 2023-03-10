package com.co.destacame.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class TheElement implements Question<Boolean> {
    private Target element;

    public TheElement(Target element) {
        this.element = element;
    }

    public static TheElement exists(Target element){return new TheElement(element);}

    @Override
    public Boolean answeredBy(Actor actor){return element.resolveFor(actor).isVisible();}
}
