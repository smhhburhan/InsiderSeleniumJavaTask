package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CareerPage;

@Listeners(utils.listener.TestNGListener.class)
public class CareerPageTest {

    CareerPage careerPage;
    BasePage basePage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        careerPage = new CareerPage();

    }

    @Test
    public void checkLocations() {

        Assert.assertTrue(basePage.checkElementIsValid(careerPage.locations));

    }

    @Test
    public void checkLifeAtInsider() {

        Assert.assertTrue(basePage.checkElementIsValid(careerPage.lifeAtInsider));

    }

    @Test
    public void checkTeams() {

        Assert.assertTrue(basePage.checkElementIsValid(careerPage.teams));

    }

    @Test
    public void clickQualityAssurance() {

        basePage.jseClick(careerPage.seeAllTeamsButton);
        basePage.waitFor(1500);
        basePage.scrollDown();
        basePage.click(basePage.loopAndMatch(careerPage.teamTitles, "Quality Assurance"));
        basePage.verifyUrl("https://useinsider.com/careers/quality-assurance/");

    }

}