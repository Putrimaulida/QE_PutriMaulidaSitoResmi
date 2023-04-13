package starter.main;

import net.thucydides.core.annotations.Step;

public class Messaging {
    @Step("I click pen button")
    public void iClickPenButton(){
        System.out.println("I click pen button");
    }
    @Step("I enter name or multiple names")
    public void iEnterNameOrMultipleNames(){
        System.out.println("I enter name or multiple names");
    }
    @Step("I write a message")
    public void iWriteAMessage(){
        System.out.println("I write a message");
    }
    @Step("I click send button")
    public void iClickSendButton(){
        System.out.println("I click send button");
    }
    @Step("I have successfully send the message")
    public void iHaveSuccessfullySendTheMessage(){
        System.out.println("I have successfully send the message");
    }
}
