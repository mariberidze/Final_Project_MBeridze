import StepObject.LoginPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;
import static DataObject.LoginPageData.code;
import static DataObject.LoginPageData.email1;
import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class LoginPageTests extends chromerunner {

    LoginPageStep loginpagestep = new LoginPageStep();

    @Test
    @Description("საიტზე შესვლა/დალოგინება - პოზიტიური ქეისი: სწორი მონაცემების შეყვანით ვცდილობ საიტზე დალოგინებას, ამასთან, უსაფრთხოების კოდის არასწორად მითითებისას, უნდა გამოვიდეს შეტყობინება - უსაფრთხოების კოდი არასწორია")
    @Severity(SeverityLevel.NORMAL)

    public void myhomege_Login_test_PositiveCases() {

        loginpagestep

                .clearcokieLoginPage()
                .enterLoginPage()
                .clearLoginPage()
                .fillemail(email)
                .fillpassword(password)
                .clickenterbtnLoginPage();
        sleep(1000);
        Assert.assertTrue(loginpagestep.enterBtn.is(Condition.enabled));
        Assert.assertTrue($(byText("შეიყვანეთ უსაფრთხოების კოდი")).has(Condition.visible));

        loginpagestep

                .fillcode(code)
                .clickenterbtn1LoginPage();
        sleep(1000);
        Assert.assertTrue(loginpagestep.enterBtn.is(Condition.enabled));
        Assert.assertTrue($(byText("უსაფრთხოების კოდი არასწორია")).has(Condition.visible));
    }

    @Test
    @Description("საიტზე შესვლა/დალოგინება - ნეგატიური ქეისი: არასწორი მონაცემების შეყვანით ვცდილობ საიტზე დალოგინებას, უნდა გამოვიდეს შეტყობინება -მომხმარებელი ან პაროლი არასწორია")
    @Severity(SeverityLevel.NORMAL)
    public void myhomege_Login_test_NegativeCases() {

        loginpagestep


                .clearcokieLoginPage()
                .enterLoginPage()
                .clearLoginPage()
                .fillemail(email1)
                .fillpassword(password)
                .clickenterbtnLoginPage();
        sleep(1000);
        Assert.assertTrue($(byText("შესვლა")).is(Condition.enabled));
        Assert.assertTrue($(byText("მომხმარებელი ან პაროლი არასწორია")).has(Condition.visible));


    }

}

