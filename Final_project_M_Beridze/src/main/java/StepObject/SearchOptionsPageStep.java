package StepObject;


import PageObject.SearchOptionsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;

public class SearchOptionsPageStep extends SearchOptionsPage {

    @Step(" საიტზე Cokie-ების წაშლა")
    public SearchOptionsPageStep clearcokieSearchOptions() {
        cookieBtn.click();
        return this;
    }

    @Step(" აირჩიე უძრ.ქონების ტიპი ")
    public SearchOptionsPageStep clickhometypesbtnSearchOptions() {
        hometypesbtn.click();
        return this;
    }

    @Step(" აირჩიე გარიგების ტიპი ")
    public SearchOptionsPageStep clickflatforrentbtnSearchOptions() {
        flatforrentbtn.click();
        return this;
    }

    @Step("აირჩიე უძრ.ქონების ტიპი - ბინა ")
    public SearchOptionsPageStep clickflatbtnSearchOptions() {
        flatbtn.click();
        return this;
    }

    @Step(" დააკლიკე ღილაკს - ძებნა ")
    public SearchOptionsPageStep clicknextbtnSearchOptions() {
        nextbtn.click();
        return this;
    }

    @Step("აირჩიე ქალაქი ")
    public SearchOptionsPageStep clickaddresscitySearchOptions() {
        addresscity.click();
        return this;
    }

    @Step("აირჩიე უბანი/ქუჩა1 ")
    public SearchOptionsPageStep clickaddressstr1SearchOptions() {
        addressstr1.click();
        return this;
    }

    @Step("აირჩიე უბანი/ქუჩა2 ")
    public SearchOptionsPageStep clickaddressstr2SearchOptions() {
        addressstr2.click();
        return this;
    }

    @Step(" დააკლიკე ძებნის ღილაკს ")
    public SearchOptionsPageStep clickfindbtnSearchOptions() {
        findbtn.click();
        return this;
    }

    @Step(" დააკლიკე სტატუსის ღილაკს ")
    public SearchOptionsPageStep clickstatusbtnSearchOptions() {
        statusbtn.click();
        return this;
    }

    @Step(" აირჩიე სტატუსი ")
    public SearchOptionsPageStep clickselectstatusbtnSearchOptions() {
        selectstatusbtn.click();
        return this;
    }

    @Step(" დააკლიკე ფასზე ")
    public SearchOptionsPageStep clickpricebtnSearchOptions() {
        pricebtn.click();
        return this;
    }

    @Step(" ჩაწერე მინ. ფასი ")
    public SearchOptionsPageStep clickminpriceinputSearchOptions(String minprice) {
        minpriceinput.setValue(minprice);
        return this;
    }

    @Step(" ჩაწერე მაქს. ფასი ")
    public SearchOptionsPageStep clickmaxpriceinputSearchOptions(String maxprice) {
        maxpriceinput.setValue(maxprice);
        maxpriceinput.shouldNotBe(Condition.empty).pressEnter();
        return this;
    }

    @Step(" აირჩიე მესაკუთრე ")
    public SearchOptionsPageStep selectownercheckboxSearchOptions() {
        selectowner.click();
        return this;
    }

    @Step(" აირჩიე სამშენებლო კომპანია ")
    public SearchOptionsPageStep clickselectcompanycheckboxSearchOptions() {
        selectcompany.click();
        selectcompany.shouldBe(Condition.selected);
        return this;
    }

    @Step(" მოიძებნა განცხადება ")
    public SearchOptionsPageStep seaserchitemsSearchOptions() {
        searchitems.shouldBe(Condition.visible);
        return this;
    }

    @Step(" კონკრეტული მისამართით ძებნა ")
    public SearchOptionsPageStep searchbyaddressinputSearchOptions(String address) {
        searchbyaddressinput.setValue(address);
        searchbyaddressinput.shouldNotBe(Condition.empty).pressEnter();
        return this;
    }

    @Step(" კონკრეტული ტელ. ნომრით ძებნა ")
    public SearchOptionsPageStep searchbytelinputSearchOptions(String telnum) {
        searchbytelinput.setValue(telnum);
        searchbytelinput.shouldNotBe(Condition.empty).pressEnter();
        return this;
    }

}