import CommonApi.BaseClass;
import org.testng.annotations.Test;

import java.util.Base64;

/**
 * Created by mounssif on 9/20/2015.
 */
public class NavigateApp extends BaseClass {
    @Test
    public void navigateTabs ()throws InterruptedException{
        //Click on Banking tab
        clickByXpath(".//*[@id='banking']");
        sleepFor(2);
        /*//Click on Checking account
        clickByXpath("./*//*[@id='link1']/ul/li[1]/a");
        sleepFor(2);
        //Cancel Select Your Residential State
        clickByXpath("./*//*[@id='cmlink_CancelBtn']");*/
        //click on Credit Cards tab
       clickByXpath("./*//*[@id='creditcards']]");
        sleepFor(2);
        clickByXpath(".//*[@id='lending']");
        sleepFor(2);

    }
}
