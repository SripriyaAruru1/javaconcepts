package oopsinterface;

public class FireFoxDriver implements WebDriver{

	@Override
	public void Click() {
		System.out.println("Click is implemented");
		
	}

	@Override
	public void get(String url) {
		System.out.println("www.http//sripriya.com");
		
	}

	@Override
	public void maximize() {
		System.out.println("Maximize is implemented");
		
	}

	@Override
	public void close() {
		System.out.println("Close is implemented");
		
	}

	@Override
	public void sendkeys(String Keys) {
		System.out.println("Sendkeys is implemented");
		
	}

	@Override
	public void submit() {
		System.out.println("Submit is implemented");
		
	}

	@Override
	public void select() {
		System.out.println("Select is implemented");
		
	}
	
	public void Menu()
	{
		System.out.println("Firefox menu is installed");
	}
	public void Download()
	{
		System.out.println("Firefox Download is installed");
	}

}
