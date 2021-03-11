package com.qa.web.PageFactory;
import com.qa.web.componenthelper.ButtonHelper;
import com.qa.web.componenthelper.GenericHelper;
import com.qa.web.componenthelper.ObjectRepository;
import com.qa.web.driverclass.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.*;
public class CategoryPage extends PageBase {
    static final Logger logger = Logger.getLogger(CategoryPage.class);
    private static WebDriver driver = ObjectRepository.Driver;
    PageBase pageBase = new PageBase(driver);

    public CategoryPage() {
        super(driver);
    }

    /**
     * Webelement
     **/
    @FindBy(how = CSS, using = "a.product-name")
    private WebElement clickPrintDressLink;

      /*  @FindBy(how =XPATH, using = "//a[@title='Printed Dress'][1]")
        private WebElement clickPrintDressLink; */
    @FindBy(how = XPATH, using = "//span[contains(text(),'Add to cart')]")
    private WebElement clickAddtoCart;
 /*   @FindBy(how = XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    private WebElement getSuccessMessage; */
    @FindBy(how = XPATH, using = "(//h2)[1]")
    private WebElement getSuccessMessage;
  /* @FindBy(how =CSS, using = "div>h2:nth-of-type(1)")
   private WebElement getSuccessMessage; */

    public void clickOnPrintDress() {
        ButtonHelper.clickButton(clickPrintDressLink);
    }

    public void clickOnAddToCart() {
        ButtonHelper.clickButton(clickAddtoCart);
    }

    public String getMessage() {
                return getSuccessMessage.getText();
    }
        /*
      public void jsClickonDresses () {
        //  GenericHelper.isWebelementActive(btnSignin);
        GenericHelper.jsClickOnElement(btnDresses);
       } */
}
