package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);}

        @FindBy(xpath = "//button[text()='KABUL ET']")
        public WebElement acceptCookiesButton;

        @FindBy(xpath = "//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']")
        public  WebElement searchTextBox;

        @FindBy(xpath = "//i[@class='cyrzo7gC']")
        public WebElement searchBoxButton;

}
