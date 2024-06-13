package runner;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Base {

    @BeforeAll
    protected static void browserSettings(){

        Configuration.browserSize = "1920x1080";
    }

}
