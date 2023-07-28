package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.PLPPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SearchBoxStepdef {

    HomePage homePage = new HomePage();

    PLPPage plpPage = new PLPPage();

    Actions actions = new Actions(Driver.getDriver());



    @Then("Click the search box field")
    public void clickTheSearchBoxField() {
        homePage.searchTextBox.click();
    }

    @And("Type the searching word")
    public void typeTheSearchingWord() {
        actions.sendKeys(ConfigReader.getProperty("SearchText")).perform();
    }

    @Then("Click search icon on the right side of searching fieldbox")
    public void clickSearchIconOnTheRightSideOfSearchingFieldbox() {

        homePage.searchBoxButton.click();
    }

    @Then("Verify that the page related to the searched product has been reached")
    public void verifyThatThePageRelatedToTheSearchedProductHasBeenReached() {
        String actualResult = plpPage.searchTitleText.getText();
        String expectedResult = ConfigReader.getProperty("SearchText");

        Assert.assertEquals(expectedResult,actualResult);

    }
}
