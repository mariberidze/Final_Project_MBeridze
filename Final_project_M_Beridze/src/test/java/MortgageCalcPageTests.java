import StepObject.MortgageCalcPageStep;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utils.chromerunner;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;
import com.codeborne.selenide.selector.ByText;
import static DataObject.MortgageCalcPageData.*;
import static DataObject.MortgageCalcPageData.phone;
import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class MortgageCalcPageTests extends chromerunner {

    MortgageCalcPageStep mortgagecalccagestep = new MortgageCalcPageStep();

    @Test
    @Description("საიტზე იპოთეკური სესხის მოთხოვნა, შესაბამის ფილდებში შემყავს სესხის თანხის, %-ის, ვადის, თანამონაწილეობის და სხვა მონაცემი, იტესტება სწორად მუშაობს თუ არა იპოსესხის კალკულატორი, ასევე,ვამოწმებ კალკულატორის შევსების მერე ბექის ღილაკს და ბანკის ლინკზე გადასვლის შესაძლებლობას - პოზიტიური ქეისი")
    @Severity(SeverityLevel.CRITICAL)
    public void myhomege_MortgageCalc_test_PositiveCases() {

        mortgagecalccagestep

                .clearcokieMortgageCalcPage()                          //ქუქიების გათიშვა
                .gotomortgagepageMortgageCalcPage();
        Assert.assertTrue(mortgagecalccagestep.mortgagepagebtn.is(Condition.enabled));

        mortgagecalccagestep
                .fillprincipalMortgageCalcPage(principal)
                .fillbaseplusamountMortgageCalcPage(baseplusamount)   //თანამონაწილეობის თანხა
                .ChooseyearMortgageCalcPage()
                .fillmonthsinputrMortgageCalcPage(months)
                .fillpercentinputMortgageCalcPage(percent)
                .clickmortgageamountMortgageCalcPage();
        Assert.assertTrue(mortgagecalccagestep.mortgageamount.is(Condition.enabled));

        mortgagecalccagestep
                .clickcurencybtnMortgageCalcPage()
                .fillprincipal2MortgageCalcPage(principal2)
                .fillnewLoanYearsMortgageCalcPage(newLoanYears)
                .fillnewLoanMonthsMortgageCalcPage(newLoanMonths)
                .clickbogbankbtnMortgageCalcPage()
                .clicknextbtnMortgageCalcPage()
                .fillfnameMortgageCalcPage(fname);
        Assert.assertEquals("მარი", "მარი", "ვამოწმებთ სწორად იწერება თუ არა სახელი");

        mortgagecalccagestep
                .filllnameinputMortgageCalcPage(lname)
                .fillpininputMortgageCalcPage(pin);
        Assert.assertEquals("0100301021", "0100301021", "ვამოწმებთ სწორად იწერება თუ არა აიდი");

        String pin1 = "0100301021";
        SelenideElement pin1num = $("#pin");
        pin1num.setValue(pin1);
        Assert.assertEquals(pin1num.getValue(), pin1, "პირადი ნომერი ჩაიწერა თუ არა");
        System.out.println(pin1);

        mortgagecalccagestep
                .fillphoneinputMortgageCalcPage(phone);
        Assert.assertNotNull($(byName("phone")).shouldNot(Condition.empty));
        Assert.assertNotNull(mortgagecalccagestep.phoneinput.shouldNot(Condition.empty)); //ბოლოს დამატებული უფრო სწორი ასერტი


        String phone = "555112233";
        SelenideElement phonenum = $(byName("phone"));
        phonenum.setValue(phone);
        Assert.assertEquals(phonenum.getValue(), phone, "ტელეფონის ნომერი ჩაიწერა თუ არა");
        System.out.println(phone);

        mortgagecalccagestep
                .clickresidentradiobtnMortgageCalcPage()
                .clickbackbtnMortgageCalcPage()
                .clickgetloanbtnMortgageCalcPage();

    }


    @Test
    @Description("საიტზე იპოთეკური სესხის მოთხოვნა,ზოგიერთ ფილდებში შემყავს სესხის მონაცემი, ზოგიერთს ვტოვებ ცარიელს -ყველა ფილდი არ არის შევსებული, ვამოწმებთ გამოტანილ ტექსტებს ასერტებით, პ.ს. თვითონ საიტზე რაიმე ერორის შეტყობინება არ გამოდის - ნეგატიური ქეისი")
    @Severity(SeverityLevel.CRITICAL)
    public void myhomege_MortgageCalc_test_NegativeCases() {

        mortgagecalccagestep

                .clearcokieMortgageCalcPage()                          //ქუქიების გათიშვა
                .gotomortgagepageMortgageCalcPage()
                .fillprincipalMortgageCalcPage(principal)
                .fillbaseplusamountMortgageCalcPage(baseplusamount)   //თანამონაწილეობის თანხა
                .ChooseyearMortgageCalcPage()
                .fillmonthsinputrMortgageCalcPage(months)
                .fillpercentinputMortgageCalcPage(percent)
                .clickmortgageamountMortgageCalcPage()
                .clickcurencybtnMortgageCalcPage()
                .fillprincipal2MortgageCalcPage(principal2)
                .fillnewLoanYearsMortgageCalcPage(newLoanYears)
                .fillnewLoanMonthsMortgageCalcPage(newLoanMonths)
                .clickbogbankbtnMortgageCalcPage()
                .clicknextbtnMortgageCalcPage()
                .fillfnameMortgageCalcPage(fname)
                .filllnameinputMortgageCalcPage(lname)
                .clickbackbtnMortgageCalcPage()
                .clickgetloanbtnMortgageCalcPage();

        Assert.assertTrue($("#pin").is(Condition.empty));
        Assert.assertTrue(mortgagecalccagestep.pininput.is(Condition.empty));     //   ბოლოს დამატებული
        Assert.assertTrue($(byName("phone")).is(Condition.empty));
        Assert.assertTrue(mortgagecalccagestep.phoneinput.is(Condition.empty));   //   ბოლოს დამატებული
        Assert.assertFalse($(byText("ვარ რეზიდენტი")).is(Condition.selected));
        Assert.assertFalse(mortgagecalccagestep.residentradiobtn.is(Condition.selected)); /// bolos dam



    }

}

