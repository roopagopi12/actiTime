package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties p = new Properties();
        p.load(new FileInputStream("./config.properties"));
        String url = p.getProperty("ITO");
        System.out.println(url);

    }
}
