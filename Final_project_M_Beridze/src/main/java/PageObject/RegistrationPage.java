package PageObject;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement


            cookieBtn = $(byXpath("//*[@id=\"CookieAgreement\"]/button")),      //ქუქიების გათიშვა
            enterBtn = $(byText("შესვლა")),
            clearBtn = $(byXpath("//*[@id=\"Modal1\"]/div/div/div/div[3]/button")),    //დასტური - გასაგებია
            createAccount = $(byText("შექმენი")),
            emailInput = $("#Email"),
            passwordInput = $(byName("Password")),
            confirmPasswordInput = $(byName("PasswordRetype")),
            genderSelect = $(byText("მდედრობითი")),
            birtyear = $(".select2-selection"),
            birtyearinput = $(byAttribute("aria-label", "Search")),
            phoneNum = $(byName("Phone")),
            phoneCodeInput = $("#PhoneCode"),
            agreem1 = $(".checkmark", 0),
            agrem2 = $(".checkmark", 1),
            regBtn = $("#registrationBtn");


}