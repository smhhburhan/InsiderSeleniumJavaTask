package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.OpenPositionsPage;
import utils.Driver;

@Listeners(utils.listener.TestNGListener.class)
public class OpenPositionsPageTest extends Driver {

    BasePage basePage;
    OpenPositionsPage openPositionsPage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        openPositionsPage = new OpenPositionsPage();

    }

    @Test
    public void filterByLocation() {

        basePage.click(openPositionsPage.filterByLocation);
        basePage.loopAndMatch(openPositionsPage.jobLocations, "Istanbul").click();
        basePage.waitFor(1000);

    }

    @Test
    public void checkResults() {

        WebElement element = driver.findElement(By.id("deneme")); // we have to get this element again after filter.
        Assert.assertEquals(Integer.valueOf(element.getText()), openPositionsPage.positionDepartment.size());
        Assert.assertEquals(Integer.valueOf(element.getText()), openPositionsPage.positionLocation.size());
        Assert.assertEquals(Integer.valueOf(element.getText()), openPositionsPage.applyNowButton.size());

    }

    @Test
    public void clickApplyNow() {

        basePage.centerElement(openPositionsPage.applyNowButton.get(1));
        basePage.hoverOverAndClick(openPositionsPage.applyNowButton.get(1));
        basePage.switchTab();
        basePage.urlContains("https://jobs.lever.co");

    }

}