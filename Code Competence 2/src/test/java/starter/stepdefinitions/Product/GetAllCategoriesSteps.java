package starter.stepdefinitions.Product;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.user.Product.GetAllCategories;

public class GetAllCategoriesSteps {
    @Steps
    GetAllCategories getAllCategories;
    @And("I receive data of all categories")
    public void iReceiveDataOfAllCategories() {
        getAllCategories.iReceiveDataOfAllCategories();
    }
}
