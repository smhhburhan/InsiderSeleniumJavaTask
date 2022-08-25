package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@id='wt-cli-accept-all-btn']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//span[normalize-space()='More']")
    public WebElement moreMenu;

    @FindBy(xpath = "//h5[normalize-space()='Careers']")
    public WebElement careerPageButton;

    @FindBy(css = "[id*=\"mega-menu-1\"]")
    public List<WebElement> menus;

}
