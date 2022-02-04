package PageObject;

import BaseClass.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {


/*
        @FindBy(id = "searchTerm")
        WebElement searchbox;

        @FindBy(className = "_2mKaC")
        WebElement searchButton;


        public void Dosearch(String item){
            searchbox.sendKeys(item);
            searchButton.click();
        }

        public void MultipleSearch(String item){

            searchbox.sendKeys(item);
            searchButton.click();
        }
*/
@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/span[2]")
WebElement SigninButton;

    public void SignIn(){
        SigninButton.click();
    }

    public void HomePageAssertion(){
        String Url = "https://www.tesco.com/";
        Assert.assertEquals(Url,"https://www.tesco.com/");
    }

    }// end of class


