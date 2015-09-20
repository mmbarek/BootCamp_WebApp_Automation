import CommonApi.BaseClass;
import org.testng.annotations.Test;

/**
 * Created by mounssif on 9/20/2015.
 */
public class NavigateTabs extends BaseClass {

    @Test
    public void navigateAppTabs()throws InterruptedException{
        // Personal tab
        clickByXpath(".//*[@id='1386067114266']/div/header/div/div[1]/div/div[1]/div/div[1]/ul/li[1]/a");
        sleepFor(1);
        // Business tab
        clickByXpath(".//*[@id='1386067114266']/div/header/div/div[1]/div/div[1]/div/div[1]/ul/li[2]/a");
        sleepFor(1);
        //Health Plans for smaller businesses
       clickByXpath(".//*[@id='1387201103302']/div/div/div[1]/div[1]/div/h3/p");
        sleepFor(1);
        //Health Plans
        clickByXpath(".//*[@id='1385638477232']/div/div/div[2]/div[1]/div[2]/h3/a");
        sleepFor(2);

    }
}
