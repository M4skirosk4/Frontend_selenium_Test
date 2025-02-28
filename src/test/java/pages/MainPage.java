package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private static By Microservice1_button = By.xpath("//button[text()='Microservicio 1']");
    private static By Microservice2_button = By.xpath("//button[text()='Microservicio 2']");
    private static By Microservice1_textfield = By.id("mv4289398rwq9");
    private static By Microservice2_textfield = By.id("f9n243fqef4wn");


    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    public void pressMicroservice1Button(){
        driver.findElement(Microservice1_button).click();
    }

    public void pressMicroservice2Button(){
        driver.findElement(Microservice2_button).click();
    }

    public String getMicroservice1TextField(){
        WebElement Microservice1Text = driver.findElement(Microservice1_textfield);
        String valueof = Microservice1Text.getAttribute("value");
        return valueof;
    }

    public String getMicroservice2TextField(){
        WebElement Microservice2Text = driver.findElement(Microservice2_textfield);
        String valueof = Microservice2Text.getAttribute("value");
        return valueof;
    }

    public static By getMicroservice1_button() {
        return Microservice1_button;
    }

    public static By getMicroservice2_button() {
        return Microservice2_button;
    }
}
