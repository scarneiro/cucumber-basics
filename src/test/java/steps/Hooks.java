package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Before hook - Launching browser");
    }

    @After
    public void tearDown() {
        System.out.println("After hook - Exiting browser");
    }
}
