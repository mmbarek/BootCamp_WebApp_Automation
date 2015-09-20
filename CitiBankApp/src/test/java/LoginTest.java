import CommonApi.BaseClass;
import org.testng.annotations.Test;

/**
 * Created by mounssif on 9/20/2015.
 */
public class LoginTest extends BaseClass{
    @Test
    // Test to login to Citibank online.
    public void singIn()throws InterruptedException {

        typeByXpath(".//*[@id='username']", "mmbarek");
        sleepFor(3);
        typeByXpath(".//*[@id='pwd']", "Qwert1234");
        sleepFor(3);
        clickByXpath(".//*[@id='find-submit']");
        sleepFor(2);

    }
}

