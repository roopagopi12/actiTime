package script;

import generic.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 extends BaseTest {

    @Test
    public void testB() {
        Reporter.log("testB", true);
    }
}
