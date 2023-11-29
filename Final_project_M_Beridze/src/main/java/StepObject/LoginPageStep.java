package StepObject;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPageStep extends LoginPage {

    @Step(" საიტზე Cokie-ების წაშლა")
    public LoginPageStep clearcokieLoginPage() {
        cookieBtn.click();
        return this;
    }

    @Step(" საიტზე შესვლის ღილაკზე დაკლიკვა ")
    public LoginPageStep enterLoginPage() {
        enterBtn.click();
        return this;
    }

    @Step(" TNET-ის ინფოს - დასასტურება")
    public LoginPageStep clearLoginPage() {
        clearBtn.click();
        return this;
    }

    @Step(" ელ.ფოსტის ფილდის შევსება ")
    public LoginPageStep fillemail(String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }


    @Step(" პაროლის ფილდის შევსება ")
    public LoginPageStep fillpassword(String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step(" შესვლა ღილაკზე დაკლიკვა ")
    public LoginPageStep clickenterbtnLoginPage() {
        clickenterbtn.click();
        clickenterbtn.shouldBe(Condition.enabled);
        $(byText("შესვლა")).shouldBe(Condition.enabled);
        return this;
    }


    @Step(" უსაფრთხოების კოდის ჩაწერა ")
    public LoginPageStep fillcode(String code) {
        fillcodeInput.setValue(code);
        fillcodeInput.shouldNotBe(Condition.empty);
        return this;
    }
    @Step(" შესვლა ღილაკზე ხელახლა დაკლიკვა ")
    public LoginPageStep clickenterbtn1LoginPage() {
        clickenterbtn.click();
        clickenterbtn.shouldBe(Condition.enabled);
        $(byText("შესვლა")).shouldBe(Condition.enabled);
        return this;
    }

}
