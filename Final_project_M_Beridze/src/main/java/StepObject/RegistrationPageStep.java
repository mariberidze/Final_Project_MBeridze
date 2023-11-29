package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegistrationPageStep extends RegistrationPage {

    @Step(" საიტზე Cokie-ების წაშლა")
    public RegistrationPageStep clearcokieRegistrationPage() {
        cookieBtn.click();
        return this;
    }

    @Step(" საიტზე შესვლის ღიალკზე დაკლიკვა ")
    public RegistrationPageStep enterRegistrationPage() {
        enterBtn.click();
        return this;
    }

    @Step(" TNET-ის ინფოს - დასასტურება")
    public RegistrationPageStep clearRegistrationPage() {
        clearBtn.click();
        return this;
    }

    @Step(" საიტზე ანგარიშის შექმნა ")
    public RegistrationPageStep createAccountRegistrationPage() {
        createAccount.click();
        return this;
    }

    @Step(" ელფოსტის ფილდის შევსება ")
    public RegistrationPageStep fillemail(String email) {
        emailInput.setValue(email);
        emailInput.shouldNotBe(Condition.empty);
        return this;
    }


    @Step(" პაროლის ფილდის შევსება ")
    public RegistrationPageStep fillpassword(String password) {
        passwordInput.setValue(password);
        passwordInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step(" გაიმეორე პაროლის ფილდის შევსება ")
    public RegistrationPageStep fillconfirmPassword(String confirmPassword) {
        confirmPasswordInput.setValue(confirmPassword);
        confirmPasswordInput.shouldNotBe(Condition.empty);
        sleep(300);
        return this;
    }

    @Step(" სქესის არჩევა ")
    public RegistrationPageStep selectgender() {
        genderSelect.click();
        return this;
    }

    @Step(" აირჩიე დაბადების წელი ")
    public RegistrationPageStep birtyearRegistrationPage() {
        birtyear.click();
        return this;
    }

    @Step(" აირჩიე/შეავსე დაბადების წელი ")
    public RegistrationPageStep fillbirtyear(String birthyear) {
        $(byText("აირჩიე დაბადების წელი")).should(Condition.visible);
        birtyearinput.setValue(birthyear);
        birtyearinput.shouldNotBe(Condition.empty).pressEnter();
        return this;
    }


    @Step(" ჩაწერე ტელეფონის ნომერი ")
    public RegistrationPageStep fillphoneNum(String phone) {
        phoneNum.setValue(phone);
        phoneNum.shouldNotBe(Condition.empty);
        return this;
    }

    @Step(" SMS კოდი ")
    public RegistrationPageStep fillPhoneCode(String PhoneCode) {
        phoneCodeInput.setValue(PhoneCode);
        phoneCodeInput.shouldNotBe(Condition.empty);
        return this;
    }

    @Step(" ვეთანხმები წესებს და პირობებს ")
    public RegistrationPageStep fillagreem1() {
        agreem1.click();
        return this;
    }

    @Step(" ვეთანხმები კონფიდენციალობის პოლიტიკას ")
    public RegistrationPageStep fillagreem2() {
        agrem2.click();
        return this;
    }

    @Step(" დადასტურების ღილაკლზე დაკლიკვა ")
    public RegistrationPageStep clickonregBtn() {
        regBtn.click();
        return this;
    }

}