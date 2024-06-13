package automationSelenideQaGuru;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import runner.Utils;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest extends Utils {


    @Test
    protected void firstTest(){

        open("https://github.com/");
        $("span[class='flex-1']").click();
        $(By.id("query-builder-test")).setValue("selenide\n");
        $(".Box-sc-g0xbh4-0.cgQapc").shouldHave(text("5.4k results"));
    }

    @Test
    protected void practiceFormNameEmail(){

        openDemoqa();
        $("input[placeholder=\"First Name\"]").setValue("Oleg");
        $("input[placeholder=\"Last Name\"]").setValue("Fedorov");
        $(By.xpath("//input[@placeholder=\"name@example.com\"]")).setValue("badMotherFucker@gmail.com");
        $(By.xpath("//input[@class=\"mr-sm-2 form-control\"]")).shouldHave(value("badMotherFucker@gmail.com"));

    }

    @Test
    protected void practiceForm(){

        openDemoqa();
        $(By.xpath("//label[normalize-space()='Other']")).click();
        $(By.xpath("//label[normalize-space()='Other']")).shouldBe(enabled);
        Selenide.sleep(5000);


    }
}
