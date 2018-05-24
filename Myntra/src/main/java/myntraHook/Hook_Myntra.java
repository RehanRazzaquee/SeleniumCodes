package myntraHook;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hook_Myntra extends ProjectMethods {

	@Before
	public void before(Scenario sc)  {
		startResult();
		startTestModule(sc.getName(), sc.getId());
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Myntra");
		startApp("chrome");		
	}
		
	@After
	public void after()   {
		endResult();
		closeAllBrowsers();
		
	}

	
}

