import CommonApi.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by mounssif on 9/20/2015.
 */
public class LoginTest extends BaseClass {
    @Test
    // Test to login to Cigna.
    public void singIn()throws InterruptedException {
        clickByCss("#login");
        sleepFor(1);
        WebElement element = getWebElementByXpath("//*[@id=\"mycigna-loginRegister\"]");
        iframeHandle(element);
        WebElement innerframe = getWebElementByXpath("//*[@id=\"mycigna-loginRegister\"]/div[1]/div/div[1]");
        iframeHandle(innerframe);
        //Enter UserName
        typeByXpath("//*[@id=\"username\"]", "mmbarek");
        sleepFor(3);
        /*typeByXpath("./*//*[@id='password']", "Qwert1234");
        sleepFor(3);
        clickByCss("./*//*[@id='userForm']/fieldset[2]/div/span/button");
        sleepFor(2);*/

    }
}
