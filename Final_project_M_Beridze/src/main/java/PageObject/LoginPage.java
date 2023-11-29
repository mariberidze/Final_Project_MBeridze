package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public SelenideElement


            cookieBtn = $(byXpath("//*[@id=\"CookieAgreement\"]/button")), //ქუქიების გათიშვა
            enterBtn = $(byText("შესვლა")),
            clearBtn = $(byXpath("//*[@id=\"Modal1\"]/div/div/div/div[3]/button")),  //დასტური - გასაგებია
            emailInput = $("#Email"),
            passwordInput = $(byName("Password")),
            clickenterbtn = $(byText("შესვლა")),
            fillcodeInput =  $(byName("captcha_value"));


}