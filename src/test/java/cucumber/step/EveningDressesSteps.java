package cucumber.step;

import io.cucumber.java.en.Given;
import pageobject.EveningDressesPage;
import pageobject.NavigationPage;

public class EveningDressesSteps {
    @Given("I click on 'Evening Dresses' tab in navigation menu")
    public void i_click_on_tab_in_navigation_menu() {
      new NavigationPage(CommonSteps.getDriver()).clickOnEveningDressesLink();
    }


}
