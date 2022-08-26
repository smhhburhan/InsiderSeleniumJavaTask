package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.MainPage;

@Listeners(utils.listener.TestNGListener.class)
public class MainPageTest {

    BasePage basePage;
    MainPage mainPage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        mainPage = new MainPage();

    }

    @Test
    public void navigateUrl() {

        basePage.navigateToUrl("https://useinsider.com/");

    }

    @Test
    public void checkUrl() {

        basePage.verifyUrl("https://useinsider.com/");

    }

    @Test
    public void acceptCookies() {

        basePage.click(mainPage.acceptCookies);

    }

    @Test
    public void clickMoreMenu() {

        basePage.click(mainPage.moreMenu);
        Assert.assertEquals(basePage.loopAndMatch(mainPage.menus, "More").getAttribute("aria-expanded"), "true");

    }

    @Test
    public void clickCareerPage() {

        basePage.click(mainPage.careerPageButton);
        basePage.verifyUrl("https://useinsider.com/careers/");

    }

}