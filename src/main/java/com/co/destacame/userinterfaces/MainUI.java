package com.co.destacame.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class MainUI {

    public static final Target INPUT_SEARCH = Target.the("Input Search").locatedBy("//*[@id='searchalgolia']//form//input");
    public static final Target BUTTON_SEARCH = Target.the("Button Search").locatedBy("//button[@class='ais-input-search-button']");
    public static final Target BUTTON_PRODUCT = Target.the("Button Product").locatedBy("//*[@id='{0}']");
    public static final Target BUTTON_ADD_PROD = Target.the("Button Add Prod").locatedBy("//*[@id='addtocart_{0}_1']");
    public static final Target MESSAGE_CONGRATULATIONS = Target.the("Message Congratulations").locatedBy("//div[contains(text(),'¡Felicidades! Agregaste ')]");
    public static final Target BUTTON_CONTINUE_SHOP = Target.the("Button Continue Shop").located(By.id("seguir_comprando"));
    public static final Target BUTTON_VIEW_CART = Target.the("Button View Cart").locatedBy("//a[@class='button-bg button-bg--blue']");
    public static final Target NORMAL_PRICE = Target.the("Normal Price").locatedBy("//p[@class='card-title card-title--normal color-dark-2']");
    public static final Target BUTTON_PAY = Target.the("Button Pay").located(By.id("btn_ir_pantalla"));
    public static final Target BUTTON_CONTINUE_GUEST = Target.the("Button Continue Guest").located(By.id("btn_invitado"));
    public static final Target RADIOBUTTON_STORE_PICKUP = Target.the("Radiobutton Store Pickup").locatedBy("//*[@type='radio' and @id='accordion1']");
    public static final Target LIST_STORE = Target.the("List Store").locatedBy("//div[@class='choices__item choices__item--selectable']");
    public static final Target BUTTON_REGRESAR = Target.the("Button regresar").located(By.id("atras_adelante"));
    public static final Target SERENA_STORE = Target.the("Serena Store").locatedBy("//*[@id='choices--sel_tienda_carro-item-choice-2']");
    public static final Target STORE_ADDRESS = Target.the("Store Address").located(By.id("direccion_entrega"));
    public static final Target MESSAGE_OUTOF_STOCK = Target.the("Message Out Of Stock").locatedBy("//div[@class='paragraph paragraph--mini']");
    public static final Target ANOTHER_STORE = Target.the("Another Store").locatedBy("//*[@id='choices--sel_tienda_carro-item-choice-10']");
    public static final Target BUTTON_CONTINUE_PAY = Target.the("Button Continue Pay").located(By.id("btn_continuar_pago"));
    public static final Target BUTTON_DELETE_PROD1 = Target.the("Button Delete Prod1").locatedBy("//*[@id='bton_deleteprod_{0}']");
    public static final Target MESSAGE_PRODUCT_REMOVED = Target.the("Message Product Removed").locatedBy("//div[contains(text(),'Se ha eliminado del carro')]");


}
