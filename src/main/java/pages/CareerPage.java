package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CareerPage extends BasePage {

    @FindBy(id ="location-slider")
    public WebElement locations;

    @FindBy(className ="elementor-widget-wrap")
    public WebElement lifeAtInsider;

    @FindBy(css = "[class=\"col-12 d-flex flex-wrap p-0 career-load-more\"]")
    public WebElement teams;

    @FindBy(css = "[class*=\"btn btn-outline-secondary rounded\"]")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "//*[contains(@class,\"job-title\")]//a//h3")
    public List<WebElement> teamTitles;

}
