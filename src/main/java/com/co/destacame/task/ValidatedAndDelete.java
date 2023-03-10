package com.co.destacame.task;

import com.co.destacame.interactions.WaitFor;
import com.co.destacame.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.co.destacame.userinterfaces.MainUI.*;
import static com.co.destacame.utils.constants.General.*;


public class ValidatedAndDelete implements Task {
    ProductModel listProductoModel;


    public ValidatedAndDelete(ProductModel listProductoModel) {
        this.listProductoModel = listProductoModel;

    }

    public static ValidatedAndDelete Product(ProductModel listProductModel ){
        return Tasks.instrumented(ValidatedAndDelete.class, listProductModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

            actor.attemptsTo(Click.on(BUTTON_VIEW_CART));
            String precioNormal = NORMAL_PRICE.resolveFor(actor).getText();
            String precio = precioNormal.substring(2,precioNormal.length());
            String precioValidar = precio.replace(".","");
            if(Integer.parseInt(precioValidar) > Integer.parseInt(Comparacion)){
                System.out.println("Monto mayor al presupuesto");
                actor.attemptsTo(Click.on(BUTTON_DELETE_PROD1.of(listProductoModel.getId_product())));
                actor.attemptsTo(WaitFor.seconds(3));
            }
            actor.attemptsTo(Click.on(BUTTON_PAY));
            actor.attemptsTo(Click.on(BUTTON_CONTINUE_GUEST));
            actor.attemptsTo(WaitFor.seconds(3));
            actor.attemptsTo(Click.on(RADIOBUTTON_STORE_PICKUP));
            actor.attemptsTo(WaitFor.seconds(2));
            actor.attemptsTo(Scroll.to(BUTTON_REGRESAR));
            actor.attemptsTo(Click.on(LIST_STORE));
            actor.attemptsTo(WaitFor.seconds(5));
            actor.attemptsTo(Click.on(SERENA_STORE));
            actor.attemptsTo(WaitFor.seconds(5));
            String address = STORE_ADDRESS.resolveFor(actor).getText();
            if(!address.equals(ADDRESS)){
                System.out.println("La dirección no es Igual");
            }
            else {
                System.out.println("La dirección de la Serena es correcta");
            }
            if(MESSAGE_OUTOF_STOCK.resolveFor(actor).isVisible()){
                actor.attemptsTo(WaitFor.seconds(2));
                actor.attemptsTo(Click.on(LIST_STORE));
                actor.attemptsTo(WaitFor.seconds(2));
                actor.attemptsTo(Click.on(ANOTHER_STORE));
                actor.attemptsTo(WaitFor.seconds(5));
            }

    }
}
