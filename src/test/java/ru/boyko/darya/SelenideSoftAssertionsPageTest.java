package ru.boyko.darya;

import com.codeborne.selenide.Condition;
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
        SelenideElement softAssertionsElement = $("#wiki-body").$(byTextCaseInsensitive("soft assertions"));
        softAssertionsElement.should(exist);
        softAssertionsElement.click();
        //search JUnit5 code example assuming by the header. Assume that given code corresponds to the header
        $("#wiki-body").$(withTextCaseInsensitive("Using JUnit5")).should(exist);

    }
}
