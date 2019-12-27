package example;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageTraditionalSeleniumTests extends BaseSeleniumTests {

    @Test
    public void getSearchPage() {
        this.driver.get("https://www.google.com");
        WebElement element = this.driver.findElement(By.name("q"));
        assertNotNull(element);
    }

}
