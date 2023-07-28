package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepdef {

    HomePage homePage = new HomePage();

    @Given("User goes to trendyol.com")
    public void user_goes_to_trendyol_com() {

        Driver.getDriver().get(ConfigReader.getProperty("BaseUrl"));
    }

    @Then("Accept the cookies")
    public void acceptTheCookies() {

        homePage.acceptCookiesButton.click();

    }

    @Then("Verify to be on the right site")
    public void verifyToBeOnTheRightSite() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @And("Close the page")
    public void closeThePage() {
        Driver.quitDriver();
    }


}
