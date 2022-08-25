package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OpenPositionsPage extends BasePage{

    @FindBy(xpath = "//span[@id='select2-filter-by-location-container']")
    public WebElement filterByLocation;

    @FindBy(css = "[class=\"select2-results__option\"]")
    public List<WebElement> jobLocations;

    @FindBy(css = "[class*=\"position-department\"]")
    public List<WebElement> positionDepartment;

    @FindBy(css = "[class*=\"position-location\"]")
    public List<WebElement> positionLocation;

    @FindBy(css = "[class*=\"btn btn-navy rounded pt-2 pr-5 pb-2 pl-5\"]")
    public List<WebElement> applyNowButton;

}
