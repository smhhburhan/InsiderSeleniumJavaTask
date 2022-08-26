package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.QualityAssurancePage;

@Listeners(utils.listener.TestNGListener.class)
public class QualityAssurancePageTest {

    BasePage basePage;
    QualityAssurancePage qualityAssurancePage;

    @BeforeClass
    public void initiliaze() {

        basePage = new BasePage();
        qualityAssurancePage = new QualityAssurancePage();

    }

    @Test
    public void clickSeeAllQAJobs() {

        basePage.jseClick(qualityAssurancePage.seeAllQAJobsButton);
        basePage.verifyUrl("https://useinsider.com/careers/open-positions/?department=qualityassurance");

    }

}