package hooksPack;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.LoginPage;
import wdMethods.SeMethods;


public class Hooks extends LoginPage{

		
	@Before
	public void before(Scenario sc)  {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Testleaf");
		startApp("chrome");	
		enterUserName();
		enterPassword();
		clickLogIn();
	}
		
	@After
	public void after()   {
		endResult();
		closeAllBrowsers();
		
	}

	
}
