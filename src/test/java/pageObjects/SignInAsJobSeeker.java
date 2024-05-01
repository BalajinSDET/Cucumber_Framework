package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignInAsJobSeeker extends BasePage {

    public SignInAsJobSeeker(WebDriver driver) {
        super(driver);


    }

    @FindBy(xpath = "//h4[contains(text(),'Sign in')]")
    protected WebElement SignInJobSeekerHeader;

    @FindBy(xpath = "//input[@type='email']")
    protected WebElement emailfield;

    @FindBy(xpath = "//input[@type='password']")
    protected WebElement passwordfield;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement signinbutton;

    public void ValidateSignInAsJobSeekerPage() {
        //ReusableActions.HighlightingElement(SignInJobSeekerHeader);
    }

    public void SetRegisteredEmailId(String email) {
        emailfield.sendKeys(email);
        //ReusableActions.clickAndType(emailfield,email );
    }

    public void SetPassword(String password) {
        passwordfield.sendKeys(password);
        //ReusableActions.clickAndType(passwordfield, password);
    }

    public void ClickSignInButton() {
       // ReusableActions.click(signinbutton);
        signinbutton.click();
    }

}
