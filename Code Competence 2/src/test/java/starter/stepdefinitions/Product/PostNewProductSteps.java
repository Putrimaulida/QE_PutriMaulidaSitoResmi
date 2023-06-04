package starter.stepdefinitions.Product;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.user.Product.PostNewProduct;

public class PostNewProductSteps {
    @Steps
    PostNewProduct postNewProduct;
    @And("I received new data")
    public void iReceivedNewData() {
        postNewProduct.iReceivedNewData();
    }
}
