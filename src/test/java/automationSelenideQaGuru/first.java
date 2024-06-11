package automationSelenideQaGuru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class first {


    @Test
    protected void firstTest(){

        Configuration.browserSize = "1920x1080";

        open("https://github.com/");
        $("span[class='flex-1']").click();
        $(By.id("query-builder-test")).setValue("selenide\n");
        Selenide.sleep(12212);
        $(".Box-sc-g0xbh4-0.cgQapc").shouldHave(text("5.4k results"));


    }

}
