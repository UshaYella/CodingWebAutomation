package com.qa.web.PageFactory;

import com.qa.web.componenthelper.*;
import com.qa.web.driverclass.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.openqa.selenium.support.How.*;
public class AaccountPage extends PageBase {
    static final Logger logger = Logger.getLogger(AaccountPage.class);
    private static WebDriver driver = ObjectRepository.Driver;

    PageBase pageBase = new PageBase(driver);

    public AaccountPage() {
        super(driver);
    }

        /** Webelement **/
        @FindBy(how = CLASS_NAME, using = "info-account")
        private WebElement displayMessage;

       @FindBy(how = CSS,  using = "a[title='Dresses']")
        private WebElement btnDresses;



        public String getMessage () {
        return   displayMessage.getText();

        }
        /*
        public void clickOnDresses() {

            ButtonHelper.clickButton(btnDresses);
        } */
      public void jsClickonDresses () {
        //  GenericHelper.isWebelementActive(btnSignin);
        GenericHelper.jsClickOnElement(btnDresses);
       }







}
