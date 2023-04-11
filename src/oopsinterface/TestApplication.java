package oopsinterface;

public class TestApplication {

	public static void main(String[] args) {
		FireFoxDriver browser = new FireFoxDriver();
		browser.Click();
		browser.get("http://www.sri.com");
		browser.maximize();
		browser.submit();
		browser.Menu();
		browser.Download();
		browser.close();
		System.out.println("**************");
		WebDriver browser1 = new FireFoxDriver();
		browser1.Click();
		browser1.get("http://www.Suku.com");
		browser1.maximize();
		browser1.submit();
			browser1.close();
			System.out.println("**************");
			ChromeDriver browser2 = new ChromeDriver();
			browser2.Click();
			browser2.get(null);
			browser2.maximize();
			browser2.menu1();
			browser2.sendkeys(null);
			WebDriver browser3 = new ChromeDriver();
			System.out.println("**************");
			browser3.maximize();
			browser3.Click();
			browser3.get(null);
			
	}

}
