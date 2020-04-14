package cucumber.step;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobject.EveningDressesPage;

public class EveningDressesTitleSteps {
    @Then("I see 'Evening Dresses' title in evening dresses page")
    public void i_see_title_in_evening_dresses_page() {
       String actualStatusMessage = new EveningDressesPage(CommonSteps.getDriver()).getEveningPageTitle();
        Assert.assertEquals("Failed to see the Evening Dresses title","Evening Dresses",actualStatusMessage);

    }
}
