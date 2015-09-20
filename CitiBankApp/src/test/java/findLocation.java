import CommonApi.BaseClass;
import Util.DataReader;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by mounssif on 9/20/2015.
 */
public class findLocation extends BaseClass {
    DataReader dr = new DataReader();
    String path = "CitiBankApp\\Data\\ZipCodeData.xls";
    @Test
    public void bankLocation () throws InterruptedException, IOException {
        clickByXpath(".//*[@id='finderTool']/a");

        typeByXpath(".//*[@id='keyword']", "22314");
        sleepFor(2);
        clickByXpath(".//*[@id='cmlink_FindBtn_CitiLocate']/span");
        sleepFor(3);
    }

}
