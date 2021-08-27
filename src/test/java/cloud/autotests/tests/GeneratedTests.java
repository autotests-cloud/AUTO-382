package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Login")
    void generatedTest() {
        step("Open https://tcgshowdown.com/", () -> {
            step("// todo: just add selenium action");
        });

        step("Click on Sig in", () -> {
            step("// todo: just add selenium action");
        });

        step("Enter email neesa@yopmail.com", () -> {
            step("// todo: just add selenium action");
        });

        step("Enter password 123123123Qa!", () -> {
            step("// todo: just add selenium action");
        });

        step("Click on Sign in", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://tcgshowdown.com/'", () ->
            open("https://tcgshowdown.com/"));

        step("Page title should have text 'TCG Showdown'", () -> {
            String expectedTitle = "TCG Showdown";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://tcgshowdown.com/'", () ->
            open("https://tcgshowdown.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}