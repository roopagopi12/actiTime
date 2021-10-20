package script;

import generic.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 extends BaseTest {

    @Test
    public void testC() {
        Reporter.log("testC", true);
    }
}
