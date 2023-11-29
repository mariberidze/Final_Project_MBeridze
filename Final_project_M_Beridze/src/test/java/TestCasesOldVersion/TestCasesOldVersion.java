package TestCasesOldVersion;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.*;


public class TestCasesOldVersion extends chromerunner {

    @Test  (priority = 5, enabled = true)
    @Description ("1. საიტი -myhome.ge - იპოთეკური სესხის გამომთვლელი")
    public void Mytest_1() {

        // 1. საიტი -myhome.ge - იპოთეკური სესხის გამომთვლელი //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();       // ქუქიების გათიშვა
        $(byLinkText("იპოთეკა")).click();
        $("#principal").setValue("15000");
        $("#base").setValue("1200");
        $(byText("15 წელი")).click();
        $("#months").setValue("6");
        $("#percent").setValue("5");
        $(".amount").click();
        $(".gel").click();
        $(byName("principal")).setValue("14");
        $("#newLoanYears").setValue("7");
        $("#newLoanMonths").setValue("5");
        $("#bank-1").click();
        $(byText("შემდეგი")).shouldBe(Condition.enabled).click();
        $(byName("fname")).setValue("მარი");
        $(byName("lname")).setValue("მაისურაძე");
        $("#pin").setValue("0100301021");
        $(byName("phone")).setValue("555112233");
        $(byText("ვარ რეზიდენტი")).click();
        $(byText("უკან")).click();
        $(byText("აიღე იპოთეკური სესხი ონლაინ")).click();

    }


    @Test (priority = 4, enabled = true)
    @Description ("2. საიტი -myhome.ge - ავტორიზაციის გავლა ")
    public void Mytest_2() {

        // 2. საიტი -myhome.ge - ავტორიზაციის გავლა //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();       // ქუქიების გათიშვა
        $(byText("შესვლა")).click();
        $(byXpath("//*[@id=\"Modal1\"]/div/div/div/div[3]/button")).click();  //
        $("#Email").setValue("mari@gmail.com");
        $("#Password").click();
        $(byName("Password")).setValue("Aa@34567890");
        $(byText("შესვლა")).click();
        $(byText("შეიყვანეთ უსაფრთხოების კოდი")).shouldBe(Condition.visible);
        $("#CaptchaVal").setValue("ASAS");
        $(byText("შესვლა")).click();
        $(byText("უსაფრთხოების კოდი არასწორია")).shouldBe(Condition.visible);

    }

    @Test (priority = 3, enabled = true)
    @Description ("3. საიტი -myhome.ge - რეგისტრაციის გავლა")
    public void Mytest_3() {

        // 3. საიტი -myhome.ge - რეგისტრაციის გავლა //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();       // ქუქიების გათიშვა
        $(byText("შესვლა")).click();
        $(byXpath("//*[@id=\"Modal1\"]/div/div/div/div[3]/button")).click();     //გასაგებია ღილაკი
        $(byText("შექმენი")).click();
        $("#registrationBtn").scrollIntoView(true); //სქროლები ჩავთიშე პომ-ში , რადგან ეს ურევდა მთლიან ტესტს
        $("#Email").scrollIntoView(true); //სქროლები ჩავთიშე პომ-ში , რადგან ეს ურევდა მთლიან ტესტს
        $("#Email").click();
        $("#Email").setValue("mari@gmail.com");
        Assert.assertEquals("mari@gmail.com", "mari@gmail.com", "ვამოწმებთ სწორად იწერება თუ არა ელ.ფოსტა");
        $(byName("Password")).click();
        $(byName("Password")).setValue("Aa@34567890");
        $(byName("PasswordRetype")).click();
        $(byName("PasswordRetype")).setValue("Aa@34567890");
        $(byText("მდედრობითი")).click();
        $(".select2-selection").click();         //დაბადების წელი
        sleep(300);
        $(byAttribute("aria-label", "Search")).setValue("2000").pressEnter();  //დაბადების წელის ჩაწერა
        $(byName("Phone")).setValue("577889900");
        Assert.assertEquals("577889900", "577889900", "ვამოწმებთ სწორად იწერება თუ არა tel.");
        $("#PhoneCode").setValue("0000");
        $(".checkmark", 0).click();           // თანხმობა 1
        $(".checkmark", 1).click();              // თანხმობა 2
        $("#registrationBtn").click();
        sleep(3000);
        Assert.assertFalse($(".error wrong").has(Condition.matchText("მოითხოვეთ ახალი კოდი")));

    }



    @Test (priority = 0, enabled = true)
    @Description ("4. საიტი -myhome.ge - განცხადების ძებნა - სხვადასხვა ოფშენების არჩევით ")
    public void Mytest_4() {

        // 4. საიტი -myhome.ge - განცხადების ძებნა - სხვადასხვა ოფშენების არჩევით: //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $("#homeTypes").click();
        $(byLinkText("ქირავდება დღიურად")).click();
        $(byText("ბინები")).click();
        $(".next_input").click();
        $(byText("ბათუმი")).click();
        $(byText("აეროპორტის უბანი")).click();
        $(byText("ხიმშიაშვილის უბანი")).click();
        $(byText("ძებნა")).click();
        $(byText("სტატუსი")).click();
        $(byText("ახალი აშენებული")).click();
        $(byClassName("name")).click();
        $(byName("FPriceFrom")).setValue("100");
        $("#price-to").setValue("500").pressEnter();

        //assertions:

        $(byText("მესაკუთრე")).click();
        Assert.assertTrue($("#izzd36").is(Condition.selected));

        $("#MaklerTitle2").click();
        Assert.assertTrue($("#iddd").isSelected());

        $(".searched-items").shouldBe(Condition.visible);

        Assert.assertFalse($(".searched-items").has(Condition.matchText("მოიძებნა 6000 განცხადება")));


    }


    @Test (priority = 1, enabled = true)
    @Description ("5. საიტი -myhome.ge - განცხადების ძებნა - კონკრეტული მისამართის მითითებით")
    public void Mytest_5() {

        // 5. საიტი -myhome.ge - განცხადების ძებნა - კონკრეტული მისამართის მითითებით: //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $(By.name("Keyword")).click();
        $(byName("Keyword")).setValue("საგურამო").pressEnter();
        Assert.assertEquals("საგურამო", "საგურამო", "ვამოწმებთ სწორად იწერება თუ არა ტექსტი სერჩში");



    }

    @Test (priority = 2, enabled = true)
    @Description ("საიტი -myhome.ge -განცხადების ძებნა - კონკრეტული ტელ.ნომრის მითითებით")
    public void Mytest_6() {

        // 6. საიტი -myhome.ge -განცხადების ძებნა - კონკრეტული ტელ.ნომრის მითითებით: //

        $(byXpath("//*[@id=\"CookieAgreement\"]/button")).click();
        $("#by-keyword").click();
        $("#by-keyword").setValue("577100880").pressEnter();

        // I assertion:

        Assert.assertNotNull($("#by-keyword").shouldNot(Condition.empty));
        sleep(2000);

        // II assertion:

        String tel = "577100880";
        SelenideElement telnum = $("#by-keyword");
        telnum.setValue(tel);
        Assert.assertEquals(telnum.getValue(), tel, "ტელეფონის ნომერი ჩაიწერა თუ არა");
        System.out.println(tel);

    }


}

