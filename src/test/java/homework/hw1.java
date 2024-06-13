package homework;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import runner.Utils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class hw1 extends Utils {

    @Test
    protected void gitTest(){

        open("https://github.com/");
        $("span[class='flex-1']").click();
        $(By.id("query-builder-test")).setValue("Selenide\n");
        $$(By.xpath("//div[@class=\"Box-sc-g0xbh4-0 bBwPjs search-title\"]"))
                .first().$(By.tagName("a")).click();
        $(By.id("wiki-tab")).click();
        $(By.id("wiki-pages-filter")).setValue("SoftAssertions")
                .shouldHave(value("SoftAssertions"));
        $(By.xpath("//a[normalize-space()='SoftAssertions']")).click();
        $(By.xpath("//h4[text()=\"3. Using JUnit5 extend test class:\"]"))
                .shouldHave(text("3. Using JUnit5 extend test class:"));
        sleep(5000);

    }
}
