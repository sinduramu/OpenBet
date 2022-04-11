package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BetFedHooks {
	
	@Before
	public static void openBrowser()
	{
		System.out.println("Launch the Browser");
	}
	@After
	public static void deleteAllCookies()
	{
		System.out.println("Close the Browser");
	}

}
