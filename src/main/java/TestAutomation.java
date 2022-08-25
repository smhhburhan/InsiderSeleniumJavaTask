/*import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
//import java.time.Duration;


public class TestAutomation {


    public static void main(String[] args) throws Exception {


        // invoking Browser
        // Chrome - ChromeDriver -> Methods close get ..
        // chromedriver.exe -> Chrome browser
        // webdriver.chrome.deriver -> value of path
        // Firefox - FirefoxDriver -> Methods close get ..
        // geckodriver.exe -> Firefox browser
        // webdriver.gecko.deriver -> value of path

        // the browser should be changeable, but it has not work yet.
        //System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        //WebDriver driver = new FirefoxDriver ();
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize the browser window
        JavascriptExecutor jse = (JavascriptExecutor) driver;


        driver.get("https://useinsider.com/"); // 1a) visit url
        System.out.println(driver.getCurrentUrl()); // 1b) checking homepage is opened or not
        Assert.assertEquals(driver.getCurrentUrl(), "https://useinsider.com/");
        driver.findElement(By.xpath("//a[@id='wt-cli-accept-all-btn']")).click(); // accept all cookies


        driver.findElement(By.xpath("//span[normalize-space()='More']")).click(); // 2a) select "More" menu in navigation bar
        Thread.sleep(1500);
        driver.findElement(By.xpath("//h5[normalize-space()='Careers']")).click(); // 2b) visit "Career page"
        System.out.println(driver.getCurrentUrl()); // 2c) checking page opened or not
        Thread.sleep(1500);
        WebElement we = driver.findElement(By.xpath("//h3[normalize-space()='Our Locations']")); // 2c) checking "Locations"
        jse.executeScript("arguments[0].scrollIntoView();", we);
        Assert.assertEquals(driver.findElement(By.xpath("//h3[normalize-space()='Our Locations']")).getText(), "Our Locations");
        Thread.sleep(1500);
        WebElement we2 = driver.findElement(By.xpath("//h2[normalize-space()='Life at Insider']")); // 2c) checking "Life at Insider"
        jse.executeScript("arguments[0].scrollIntoView();", we2);
        Assert.assertEquals(driver.findElement(By.xpath("//h2[normalize-space()='Life at Insider']")).getText(), "Life at Insider");
        Thread.sleep(1500);


        WebElement we3 = driver.findElement(By.xpath("//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']")); // 3a) click "See all teams"
        jse.executeScript("arguments[0].scrollIntoView(true);", we3); // 2c) checking "Teams"
        jse.executeScript("arguments[0].click()", we3);
        Thread.sleep(1500);
        WebElement we4 = driver.findElement(By.linkText("Quality Assurance")); // 3b) select and click "Quality Assurance"
        jse.executeScript("arguments[0].scrollIntoView(true);", we4);
        jse.executeScript("arguments[0].click()", we4);
        Thread.sleep(1500);
        System.out.println(driver.getCurrentUrl()); // 3b) checking "Quality Assurance career page"
        Assert.assertEquals(driver.getCurrentUrl(), "https://useinsider.com/careers/quality-assurance/");
        driver.findElement(By.xpath("//a[normalize-space()='See all QA jobs']")).click(); // 3c) click "See all QA Jobs"
        System.out.println(driver.getCurrentUrl()); // 3d) checking open positions by department Quality Assurance
        Thread.sleep(1500);
        driver.findElement(By.xpath("//span[@id='select2-filter-by-location-container']")).click(); // 3e) click to choose filter by location as Istanbul,Turkey
        Thread.sleep(1500);
        //driver.findElement(By.cssSelector("body > span:nth-child(38) > span:nth-child(1) > span:nth-child(2) > ul:nth-child(1) > li:nth-child(6)")).click(); // 3e) select Istanbul,Turkey
        driver.findElement(By.xpath("//li[normalize-space()='Istanbul, Turkey']")).click();
        Thread.sleep(1500);
        WebElement we6 = driver.findElement(By.xpath("//h3[contains(text(),'Browse')]")); // 3f) checking presence of jobs list
        jse.executeScript("arguments[0].scrollIntoView(true);", we6);
        Assert.assertEquals(driver.findElement(By.xpath("//p[normalize-space()='Software Quality Assurance Engineer']")).getText(), "Software Quality Assurance Engineer");
        Thread.sleep(1500);


        driver.findElement(By.xpath("//a[@href='https://jobs.lever.co/useinsider/0ba4065b-955a-4661-ad4a-f32479f63757']")).click(); // 5a) click "Apply Now" button
        Thread.sleep(1500);
        //it should take url from other tab, but it has not work yet.
        System.out.println(driver.getCurrentUrl()); // 5b) verify the action redirects us to "Lever Application" form page


        getScreenshot(driver);

    }

    public static void getScreenshot(WebDriver driver) throws IOException {

        File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss, new File("./ScreenShots/ss.png"));

    }

}*/