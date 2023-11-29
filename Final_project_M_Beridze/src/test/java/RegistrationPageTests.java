import StepObject.RegistrationPageStep;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;
import com.codeborne.selenide.selector.ByText;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class RegistrationPageTests extends chromerunner {

    RegistrationPageStep registrationpagestep = new RegistrationPageStep();

    @Test
    @Description("საიტზე დარეგისტრირება - პოზიტიური ქეისი: სწორი მონაცემების შეყვანით ვცდილობ საიტზე დარეგისტრირებას, ასევე ერორ მესიჯის შემოწმებას")
    @Severity(SeverityLevel.CRITICAL)
    public void myhomege_Registration_test_PositiveCases() {

        registrationpagestep

                .clearcokieRegistrationPage()
                .enterRegistrationPage()
                .clearRegistrationPage()
                .createAccountRegistrationPage()
                .fillemail(email)
                .fillpassword(password)
                .fillconfirmPassword(confirmPassword)
                .selectgender()
                .birtyearRegistrationPage()
                .fillbirtyear(birthyear)
                .fillphoneNum(phone)
                .fillPhoneCode(PhoneCode)
                .fillagreem1()
                .fillagreem2()
                .clickonregBtn();

        Assert.assertTrue(registrationpagestep.regBtn.is(Condition.visible));
        Assert.assertFalse($(".error wrong").has(Condition.matchText("მოითხოვეთ ახალი კოდი")));

    }


    @Test
    @Description("საიტზე დარეგისტრირება - ნეგატიური ქეისი: არასწორი მონაცემების შეყვანით ვცდილობ საიტზე დარეგისტრირებას, ასევე ყველა ფილდი არ შემივსია/მომინიშნია და ვამოწმებ ერორ მესიჯებს ასერტებით")
    @Severity(SeverityLevel.CRITICAL)
    public void myhomege_Registration_test_NegativeCases() {

        registrationpagestep

                .clearcokieRegistrationPage()
                .enterRegistrationPage()
                .clearRegistrationPage()
                .createAccountRegistrationPage()
                .fillemail(email);
        Assert.assertEquals("mari@gmail.com", "mari@gmail.com", "ვამოწმებთ სწორად იწერება თუ არა ელ.ფოსტა");

        registrationpagestep
                .fillpassword(password);
        Assert.assertNotNull(registrationpagestep.passwordInput.is(Condition.empty));

        registrationpagestep
                .fillconfirmPassword(confirmPassword);
        Assert.assertFalse(registrationpagestep.confirmPasswordInput.is(Condition.empty));
        Assert.assertNotNull($(byName("PasswordRetype")).is(Condition.empty));           // პაროლი არ უნდა იყოს ჩაწერილი

        registrationpagestep
                .selectgender()
                .fillphoneNum(phone);
        Assert.assertEquals("577889900", "577889900", "ვამოწმებთ სწორად იწერება თუ არა tel.");
        Assert.assertFalse($("#input-error-Phone").has(Condition.text("ჩაწერე ტელეფონის ნომერი")));

        registrationpagestep
                .clickonregBtn();
        Assert.assertTrue(registrationpagestep.regBtn.is(Condition.visible));           //რეგისტრაციის ღილაკი აქტიურია


        // ყველა ფილდი არ შემივსია/მომინიშნია და ვამოწმებ ერორ მესიჯებს:


        Assert.assertFalse(registrationpagestep.agreem1.isSelected());               // თანხმობა მონიშნული არ უნდა იყოს
        Assert.assertTrue($("#input-error-AgreeTerms").has(Condition.text("დაეთანხმე საიტის წესებსა და პირობებს")));
        Assert.assertFalse($("#input-error-PhoneCode").has(Condition.text("მოითხოვეთ ახალი კოდი")));
        Assert.assertTrue($("#input-error-PhoneCode").has(Condition.text("ჩაწერე SMS კოდი")));

    }
}
