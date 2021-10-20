package script;

import generic.BaseTest;
import generic.FileUtils;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 extends BaseTest {

    @Test(priority = 1)
    public void testA() {
        String v = FileUtils.getXlCellValue("./data/input.xlsx", "sheet1", 0, 0);
        Reporter.log(v, true);
    }
}
