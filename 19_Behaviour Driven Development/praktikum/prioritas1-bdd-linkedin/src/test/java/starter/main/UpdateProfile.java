package starter.main;

import net.thucydides.core.annotations.Step;

public class UpdateProfile {
    @Step("I click my profile correctly")
    public void iClickMyProfileCorrectly(){
        System.out.println("I click my profile correctly");
    }
    @Step("I click pen icon options")
    public void iClickPenIconOptions(){
        System.out.println("I click pen icon options");
    }
    @Step("I am on the update profile page")
    public void iAmOnTheUpdateProfilePage(){
        System.out.println("I am on the update profile page");
    }
    @Step("I click save button")
    public void iClickSaveButton(){
        System.out.println("I click save button");
    }
}
