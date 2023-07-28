package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PLPPage {

    public PLPPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

        @FindBy(xpath = "//h1[text()='spor ayakkabi']")
        public WebElement searchTitleText;

        @FindBy(xpath = "//span[@title='Nielsen - Unisex Beyaz Ayakkabı']")
        public WebElement productLink;

        @FindBy(xpath = "//div[text()='43']")
        public WebElement chooseNumberLink;

        @FindBy(xpath = "//div[text()='Sepete Ekle']")
        public  WebElement addtoCartButton;

        @FindBy(xpath = "//p[text()='Sepetim']")
        public WebElement myCartButton;

        @FindBy(xpath = "//div[text()='Sepetim (1 Ürün)']")
        public  WebElement verifyCartText;
}
