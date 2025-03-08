import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test_Case_01 {

    WebDriver driver;

    @BeforeEach
    public void  beforeScenareo(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/erik.vila/IdeaProjects/frontend_seleniumTest/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
        driver.manage().window().fullscreen();
    }
    @Test
    public void RevisarConexionMicro1(){
        MainPage mainpage = new MainPage(driver);
        waitForElementVisible(mainpage.getMicroservice1_button());
        mainpage.pressMicroservice1Button();
        try {Thread.sleep(2000); } catch (InterruptedException e) {e.printStackTrace();}
        Assertions.assertEquals("¡Hola desde Microservicio 1!", mainpage.getMicroservice1TextField());
    }
    @Test
    public void RevisarConexionMicro2(){
        MainPage mainpage = new MainPage(driver);
        waitForElementVisible(mainpage.getMicroservice2_button());
        mainpage.pressMicroservice2Button();
        try {Thread.sleep(2000); } catch (InterruptedException e) {e.printStackTrace();}
        Assertions.assertEquals("¡Hola desde Microservicio 2!", mainpage.getMicroservice2TextField());
    }


    private void waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));}
    @AfterEach
    public void afterScenareo(){
        if(driver != null){
            driver.quit();
        }
    }
}
