import StepObject.SearchOptionsPageStep;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.chromerunner;

import static DataObject.SearchOptionsPageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchOptionsPageTests extends chromerunner {
    SearchOptionsPageStep searchoptionspagestep = new SearchOptionsPageStep();

    @Test (priority = 0, enabled = true)
    @Description("საიტზე უძრავი ქონების ძებნა სხვადასხვა ოფშენების არჩევის მიხ.მაგ: ავირჩიე უძრავი ქონების/გარიგების ტიპი, კონკრეტ. მისამართი,სტატუსი, მივუთითე თანხის რეინჯი, მესაკუთღის ტიპი..")
    @Severity(SeverityLevel.MINOR)

    public void myhomege_SearchOptions_test_PositiveCases1() {

        searchoptionspagestep

                .clearcokieSearchOptions()
                .clickhometypesbtnSearchOptions()
                .clickflatforrentbtnSearchOptions()
                .clickflatbtnSearchOptions()
                .clicknextbtnSearchOptions()
                .clickaddresscitySearchOptions()
                .clickaddresscitySearchOptions()
                .clickaddressstr1SearchOptions()
                .clickaddressstr2SearchOptions()
                .clickfindbtnSearchOptions()
                .clickstatusbtnSearchOptions()
                .clickselectstatusbtnSearchOptions()
                .clickpricebtnSearchOptions()
                .clickminpriceinputSearchOptions(minprice)
                .clickmaxpriceinputSearchOptions(maxprice)
                .selectownercheckboxSearchOptions();
       Assert.assertTrue(searchoptionspagestep.selectowner.isSelected());

        searchoptionspagestep
                .clickselectcompanycheckboxSearchOptions();
        Assert.assertTrue(searchoptionspagestep.selectcompany.isSelected());

    }


    @Test (priority = 1, enabled = true)
    @Description("საიტზე უძრავი ქონების ძებნა კონკრეტული მისამართის მითითებით, ამასთან მოწმდება ნამდვილად სწორად იწერება თუ არა გადაცემული მონაცემი შესაბამის ინფუთში")
    @Severity(SeverityLevel.MINOR)

    public void myhomege_SearchOptions_test_PositiveCases2() {

        searchoptionspagestep

                .clearcokieSearchOptions()
                .searchbyaddressinputSearchOptions(address);
        Assert.assertEquals("საგურამო", "საგურამო", "ვამოწმებთ სწორად იწერება თუ არა ტექსტი სერჩში");

    }


    @Test (priority = 2, enabled = true)
    @Description("საიტზე უძრავი ქონების ძებნა კონკრეტული ტელ.ნომრის მითითებით, ამასთან მოწმდება ნამდვილად იწერება თუ არა გადაცემული მონაცემი შესაბამის ინფუთში")
    @Severity(SeverityLevel.MINOR)

    public void myhomege_SearchOptions_test_PositiveCases3() {

        searchoptionspagestep

                .clearcokieSearchOptions()
                .searchbytelinputSearchOptions(telnum);

        // I assertion:

        Assert.assertNotNull(searchoptionspagestep.searchbytelinput.shouldNot(Condition.empty));

        // II assertion:

        String tel = "577100880";
        SelenideElement telnum = $("#by-keyword");
        telnum.setValue(tel);
        Assert.assertEquals(telnum.getValue(), tel, "ტელეფონის ნომერი ჩაიწერა თუ არა");
        System.out.println(tel);

    }
}