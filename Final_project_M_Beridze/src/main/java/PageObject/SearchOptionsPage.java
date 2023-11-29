package PageObject;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchOptionsPage {

    public SelenideElement


            cookieBtn = $(byXpath("//*[@id=\"CookieAgreement\"]/button")),         //ქუქიების გათიშვა
            hometypesbtn = $("#homeTypes"),
            flatforrentbtn = $(byLinkText("ქირავდება დღიურად")),
            flatbtn = $(byText("ბინები")),
            nextbtn = $(".next_input"),
            addresscity = $(byText("ბათუმი")),
            addressstr1 = $(byText("აეროპორტის უბანი")),
            addressstr2 = $(byText("ხიმშიაშვილის უბანი")),
            findbtn = $(byText("ძებნა")),
            statusbtn = $(byText("სტატუსი")),
            selectstatusbtn = $(byText("ახალი აშენებული")),
            pricebtn = $(byClassName("name")),
            minpriceinput = $(byName("FPriceFrom")),
            maxpriceinput = $("#price-to"),
            selectowner = $("#izzd36"),
            selectcompany =  $("#iddd"),
            searchitems = $(".searched-items"),
            searchbyaddressinput = $(byName("Keyword")),
            searchbytelinput = $("#by-keyword");

}
