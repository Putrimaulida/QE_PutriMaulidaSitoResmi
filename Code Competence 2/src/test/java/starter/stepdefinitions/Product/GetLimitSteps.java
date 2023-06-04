package starter.stepdefinitions.Product;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.user.Product.GetLimitProduct;

public class GetLimitSteps {
    @Steps
    GetLimitProduct getLimitProduct;
    @And("I receive data with a limit of 5")
    public void iReceiveDataWithALimitOf() {
        getLimitProduct.iReceiveDataWithALimitOf5();
    }
}
