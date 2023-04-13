package starter.stepdefinisions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Payment;

public class PaymentSteps {
    @Steps
    Payment payment;
    @And("I am choose go-pay payment method")
    public void iAmChooseGoPayPaymentMethod() {
        payment.iAmChooseGoPayPaymentMethod();
    }

    @And("I can see total price")
    public void iCanSeeTotalPrice() {
        payment.iCanSeeTotalPrice();
    }

    @And("I click pay now button")
    public void iClickPayNowButton() {
        payment.iClickPayNowButton();
    }

    @And("I am directed on the detail payment")
    public void iAmDirectedOnTheDetailPayment() {
        payment.iAmDirectedOnTheDetailPayment();
    }

    @And("I click pay in go-pay application")
    public void iClickPayInGoPayApplication() {
        payment.iClickPayInGoPayApplication();
    }

    @And("I am directed on the go-pay application")
    public void iAmDirectedOnTheGoPayApplication() {
        payment.iAmDirectedOnTheGoPayApplication();
    }

    @And("I am on the payment review page")
    public void iAmOnThePaymentReviewPage() {
        payment.iAmOnThePaymentReviewPage();
    }

    @And("I click pay button")
    public void iClickPayButton() {
        payment.iClickPayButton();
    }

    @Then("I am success payment product")
    public void iAmSuccessPaymentProduct() {
        payment.iAmSuccessPaymentProduct();
    }
}
