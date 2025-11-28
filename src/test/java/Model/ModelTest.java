package Model;

import RuntestBase.RunTestBAse;
import org.testng.annotations.Test;

public class ModelTest extends RunTestBAse {
    @Test
    public void removePopUp(){
        homePage.clickRemovePopUp();
        var joinUspage = homePage.clickJoinUsLink();
    }
}
