package starter.main;

import net.thucydides.core.annotations.Step;

public class Network {
    @Step("I click my network button")
    public void iClickMyNetworkButton(){
        System.out.println("I click my network button");
    }
    @Step("I click connections")
    public void iClickConnections(){
        System.out.println("I click connections");
    }
    @Step("I am on the connections page")
    public void iAmOnTheConnectionsPage(){
        System.out.println("I am on the connections page");
    }
}
