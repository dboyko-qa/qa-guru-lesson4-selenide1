package ru.boyko.darya;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSoftAssertionsPageTest {
    @Test
    public void softAssertionsTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(withTextCaseInsensitive("Show 2 more pages")).click();
        SelenideElement softAssertionsElement = $("#wiki-pages-box").$(byTextCaseInsensitive("SoftAssertions"));
        softAssertionsElement.should(exist);
        softAssertionsElement.click();
        //search JUnit5 code example assuming by the header. Assume that given code corresponds to the header
        $("#wiki-body").$(withTextCaseInsensitive("Using JUnit5")).should(exist);

    }
}
