package com.co.destacame.stepdefinitions;

import com.co.destacame.drivers.Driver;
import com.co.destacame.models.ProductModel;
import com.co.destacame.questions.TheElement;
import com.co.destacame.task.Payment;
import com.co.destacame.task.SearchAndAdd;
import com.co.destacame.task.ValidatedAndDelete;
import com.co.destacame.utils.constants.General;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static com.co.destacame.userinterfaces.MainUI.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Buy_pcfactoryStepDefinitions {
    @Given("^the user enter main page$")
    public void theUserEnterMainPage(){
        theActorInTheSpotlight().can(BrowseTheWeb.with(Driver.inThePage(General.URL)));
    }

    @When("^the user searches a element and add$")
    public void theUserSearchesAElementAndAdd(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAndAdd.Product(ListProductModel.get(0),"1"));
    }

    @And("^the user checks the successfully message$")
    public void theUserChecksTheSuccessfullyMessage(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(MESSAGE_CONGRATULATIONS)));
    }

    @And("^the user search and add other new product$")
    public void theUserSearchAndAddOtheNewProduct(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(SearchAndAdd.Product(ListProductModel.get(0),"2"));
    }

    @And("^the user checks the successfully message for add other product$")
    public void theUserChecksTheSuccessfullyMessageForAddOtherProduct(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheElement.exists(MESSAGE_CONGRATULATIONS)));
    }

    @When("^the total is superior to million delete first product$")
    public void theTotalIsSuperiorToMillionDeleteFirstProduct(List<ProductModel> ListProductModel){
        OnStage.theActorInTheSpotlight().attemptsTo(ValidatedAndDelete.Product(ListProductModel.get(0)));

    }

    @Then("^the user can to buy succesfully$")
    public void theUserCanToBuySuccesfully() {
        OnStage.theActorInTheSpotlight().attemptsTo(Payment.Product());

    }
}
