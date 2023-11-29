package StepObject;

import PageObject.MortgageCalcPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MortgageCalcPageStep extends MortgageCalcPage {

    @Step(" საიტზე Cokie-ების წაშლა")
    public MortgageCalcPageStep clearcokieMortgageCalcPage() {
        cookieBtn.click();
        return this;
    }

    @Step("იპოთეკის ფეიჯზე გადასვლა ")
    public MortgageCalcPageStep gotomortgagepageMortgageCalcPage() {
        mortgagepagebtn.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step(" შეავსე ქონების ღირებულება ")
    public MortgageCalcPageStep fillprincipalMortgageCalcPage(String principal) {
        principalinput.setValue(principal);
        return this;
    }

    @Step(" შეავსე წინასწარი შესატანი თანხა ")
    public MortgageCalcPageStep fillbaseplusamountMortgageCalcPage(String baseplusamount) {
        baseplusamountinput.setValue(baseplusamount);
        return this;
    }

    @Step(" აირჩიე სესხის ვადა - წელი")
    public MortgageCalcPageStep ChooseyearMortgageCalcPage() {
        Chooseyearbtn.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step(" აირჩიე სესხის ვადა - თვე")
    public MortgageCalcPageStep fillmonthsinputrMortgageCalcPage(String months) {
        monthsinput.setValue(months);
        return this;
    }

    @Step(" ჩაწერე წლიური განაკვეთი %")
    public MortgageCalcPageStep fillpercentinputMortgageCalcPage(String percent) {
        percentinput.setValue(percent);
        return this;
    }

    @Step(" დააკლიკე იპოთეკა თვეში - მომდევნო ფეიჯზე გადასვლა")
    public MortgageCalcPageStep clickmortgageamountMortgageCalcPage() {
        mortgageamount.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step(" აირჩიე სესხის ვალუტა ")
    public MortgageCalcPageStep clickcurencybtnMortgageCalcPage() {
        curencybtn.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step(" შეავზე თანამონაწილეობის % ")
    public MortgageCalcPageStep fillprincipal2MortgageCalcPage(String principal2) {
        principal2input.setValue(principal2);
        return this;
    }

    @Step(" ჩაწერე წელი ")
    public MortgageCalcPageStep fillnewLoanYearsMortgageCalcPage(String newLoanYears) {
        newLoanYearsinput.setValue(newLoanYears);
        return this;
    }

    @Step(" ჩაწერე თვე ")
    public MortgageCalcPageStep fillnewLoanMonthsMortgageCalcPage(String newLoanMonths) {
        newLoanMonthsinput.setValue(newLoanMonths);
        return this;
    }

    @Step(" აიჩიე ბანკი ")
    public MortgageCalcPageStep clickbogbankbtnMortgageCalcPage() {
        bogbankbtn.click();
        return this;
    }

    @Step(" დააკლიკე ღილაკს შემდეგი - მომდევნო ფეიჯზე გადასვლა ")
    public MortgageCalcPageStep clicknextbtnMortgageCalcPage() {
        nextbtn.shouldBe(Condition.enabled).click();
        return this;
    }

    @Step(" ჩაწერე სახელი")
    public MortgageCalcPageStep fillfnameMortgageCalcPage(String fname) {
        fnameinput.setValue(fname);
        return this;
    }

    @Step(" ჩაწერე გვარი ")
    public MortgageCalcPageStep filllnameinputMortgageCalcPage(String lname) {
        lnameinput.setValue(lname);
        return this;
    }

    @Step(" ჩაწერე პირადი ნომ. ")
    public MortgageCalcPageStep fillpininputMortgageCalcPage(String pin) {
        pininput.setValue(pin);
        sleep(2000);
        return this;
    }

    @Step(" ჩაწერე ტელ. ნომ. ")
    public MortgageCalcPageStep fillphoneinputMortgageCalcPage(String phone) {
        phoneinput.setValue(phone);
        sleep(2000);
        return this;
    }

    @Step(" მონიშნე ვარ რეზიდენტი ")
    public MortgageCalcPageStep clickresidentradiobtnMortgageCalcPage() {
        residentradiobtn.click();
        return this;
    }

    @Step(" დააკლიკე ღილაკს - უკან - წინა ფეიჯზედაბრუნება ")
    public MortgageCalcPageStep clickbackbtnMortgageCalcPage() {
        backbtn.click();
        return this;
    }

    @Step(" დააკლიკე აიღე სესხი ონლაინ ლინკს ")
    public MortgageCalcPageStep clickgetloanbtnMortgageCalcPage() {
        getloanbtn.click();
        return this;
    }

}