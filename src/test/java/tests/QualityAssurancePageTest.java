package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.QualityAssurancePage;
import utils.Driver;

public class QualityAssurancePageTest extends Driver{

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