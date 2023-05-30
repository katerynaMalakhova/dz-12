package dataproviders;

import com.rd.people.Man;
import com.rd.people.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "people")
    public static Object[][] people() {
        return new Object[][]{{new Woman ("WomanFirstName", "WomanLastName", 30), new Man("ManFirstName", "ManLastName", 40)}};
    }
    @DataProvider(name = "woman")
    public static Object[][] woman() {
        return new Object[][]{{new Woman ("WomanFirstName", "WomanLastName", 30)}};
    }
    @DataProvider(name = "man")
    public static Object[][] man() {
        return new Object[][]{{ new Man("ManFirstName", "ManLastName", 40)}};
    }
}
