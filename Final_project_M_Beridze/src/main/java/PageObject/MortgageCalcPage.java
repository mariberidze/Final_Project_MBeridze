package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MortgageCalcPage {
    public SelenideElement

            cookieBtn = $(byXpath("//*[@id=\"CookieAgreement\"]/button")), //ქუქიების გათიშვა
            mortgagepagebtn = $(byLinkText("იპოთეკა")),
            principalinput = $("#principal"),
            baseplusamountinput = $("#base"),
            Chooseyearbtn = $(byText("15 წელი")),
            monthsinput = $("#months"),
            percentinput = $("#percent"),
            mortgageamount = $(".amount"),
            curencybtn = $(".gel"),
            principal2input = $(byName("principal")),
            newLoanYearsinput = $("#newLoanYears"),
            newLoanMonthsinput = $("#newLoanMonths"),
            bogbankbtn = $("#bank-1"),
            nextbtn = $(byText("შემდეგი")),
            fnameinput = $(byName("fname")),
            lnameinput = $(byName("lname")),
            pininput = $("#pin"),
            phoneinput = $(byName("phone")),
            residentradiobtn = $(byText("ვარ რეზიდენტი")),
            backbtn = $(byText("უკან")),
            getloanbtn = $(byText("აიღე იპოთეკური სესხი ონლაინ"));

}