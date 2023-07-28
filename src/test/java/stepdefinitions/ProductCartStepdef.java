package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.PLPPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class ProductCartStepdef {

    PLPPage plpPage = new PLPPage();

    Actions actions = new Actions(Driver.getDriver());

    @Then("Click the product")
    public void click_the_product() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        plpPage.randomClick.click();
        plpPage.productLink.click();

    }

    @And("Choose foot size number")
    public void chooseFootSizeNumber() {
        String ilkSayfaWhd = Driver.getDriver().getWindowHandle();
        Set<String> tumWHDDegerleri = Driver.getDriver().getWindowHandles();

        String ikincisayfaWHD = "";

        for (String eachWHD : tumWHDDegerleri){
            if (!eachWHD.equals(ilkSayfaWhd)){
                ikincisayfaWHD = eachWHD;
            }
        }

        Driver.getDriver().switchTo().window(ikincisayfaWHD);
        ReusableMethods.bekle(2);

        plpPage.chooseNumberLink.click();
        ReusableMethods.bekle(2);
    }

    @Then("Click add to cart")
    public void clickAddToCart() {

        plpPage.addtoCartButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Click my cart button")
    public void clickMyCartButton() {

        plpPage.myCartButton.click();
        ReusableMethods.bekle(2);
    }

    @Then("Verify product add to cart")
    public void verifyProductAddToCart() {
        String actualResult = plpPage.verifyCartText.getText();
        String expectedResult = "Sepetim (1 Ürün)";

        ReusableMethods.bekle(3);

        Assert.assertEquals(expectedResult,actualResult);

    }
}
