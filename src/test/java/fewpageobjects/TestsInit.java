package fewpageobjects;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.baeldung.BaeldungSite;

import static com.epam.jdi.light.driver.WebDriverFactory.close;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static pageobject.uiobjects.example.baeldung.BaeldungSite.homePage;

public interface TestsInit {
    @BeforeMethod(alwaysRun = true)
    static void setUp() {
//        logger.setLogLevel(STEP);
        initElements(BaeldungSite.class);
        homePage.open();
    }

    @AfterMethod(alwaysRun = true)
    static void teardown() {
        close();
    }
}
