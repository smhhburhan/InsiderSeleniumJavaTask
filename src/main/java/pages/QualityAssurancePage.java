package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualityAssurancePage extends BasePage{

    @FindBy(css = "[class*=\"btn btn-outline-secondary rounded text\"]")
    public WebElement seeAllQAJobsButton;

}
