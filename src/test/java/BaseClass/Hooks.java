package BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    public DriverFactory driverfactory = new DriverFactory();
    @Before
    public void setup(){
        driverfactory.openBrowser();
    }
    @After
    public void teardown(){
        // driverfactory.closebrowser();
    }

}
