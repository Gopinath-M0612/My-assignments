package week1.day3;

public class Browser {
	
	public String launchBrowser(String browserName) 
	{
		
		return browserName;

	}
	
	public void loadUrl() {
		System.out.println("Browser launched successfully");
	}

	public static void main(String[] args) {

		Browser call = new Browser();
		System.out.println(call.launchBrowser("ji"));
		call.loadUrl();
		
	}

}
