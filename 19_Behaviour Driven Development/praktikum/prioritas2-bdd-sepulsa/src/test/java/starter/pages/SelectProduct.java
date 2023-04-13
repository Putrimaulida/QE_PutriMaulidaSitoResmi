package starter.pages;

import net.thucydides.core.annotations.Step;

public class SelectProduct {
    @Step("I click product pulse button")
    public void iClickProductPulseButton() {
        System.out.println("I click product pulse button");
    }

    @Step("I enter my phone number")
    public void iEnterMyPhoneNumber() {
        System.out.println("I enter my phone number");
    }

    @Step("I choose nominal pulse")
    public void iChooseNominalPulse() {
        System.out.println("I choose nominal pulse");
    }

    @Step("I am on the payment page")
    public void iAmOnThePaymentPage() {
        System.out.println("I choose nominal pulse");
    }
}
