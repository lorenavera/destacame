package com.co.destacame.task;

import com.co.destacame.interactions.WaitFor;
import com.co.destacame.models.ProductModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Objects;

import static com.co.destacame.userinterfaces.MainUI.*;

public class SearchAndAdd implements Task {

    ProductModel listProductoModel;
    String id;

    public SearchAndAdd(ProductModel listProductoModel, String id) {
        this.listProductoModel = listProductoModel;
        this.id = id;
    }

    public static SearchAndAdd Product(ProductModel listProductModel,String id){
        return Tasks.instrumented(SearchAndAdd.class, listProductModel,id);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        if(Objects.equals(id, "1")){
            actor.attemptsTo(WaitFor.seconds(2));
            actor.attemptsTo(Enter.theValue(listProductoModel.getProduct()).into(INPUT_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_PRODUCT.of(listProductoModel.getId_product())));
            actor.attemptsTo(Click.on(BUTTON_ADD_PROD.of(listProductoModel.getId_product())));
            actor.attemptsTo(WaitFor.seconds(3));
        }else{
            actor.attemptsTo(Click.on(BUTTON_CONTINUE_SHOP));
            actor.attemptsTo(Enter.theValue(listProductoModel.getOther_product()).into(INPUT_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_SEARCH));
            actor.attemptsTo(Click.on(BUTTON_PRODUCT.of(listProductoModel.getId_other_product())));
            actor.attemptsTo(Click.on(BUTTON_ADD_PROD.of(listProductoModel.getId_other_product())));
            actor.attemptsTo(WaitFor.seconds(4));
        }

    }

}
