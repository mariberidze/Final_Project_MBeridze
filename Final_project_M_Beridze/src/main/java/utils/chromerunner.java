package utils;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.Selenide.open;


public class chromerunner {

    @BeforeMethod  (description = "საიტის myhome.ge-ს კონფიგურაციების გამართვა")
    public void setUp() {
        Configuration.browserSize = "1920x1080";
        open("https://www.myhome.ge/");
    }

    @AfterMethod (description = "საიტის myhome.ge-ს დახურვა ტესტის დასრულებისას")
    public void tearDown() {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}

