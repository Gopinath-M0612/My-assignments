package week3.day1.polymorphism;

public class LoginPage extends BasePage{
	
public void findElement() {
		
		System.out.println("Find Elements");
	}
	
	public void clickElement() {
		
		System.out.println("Click Element");

	}
	
	public void enterText() {
		
		System.out.println("Enter Text");

	}
	
	public void performCommonTask() {
		
		System.out.println("Perform Common Task");
	}

	public static void main(String[] args) {
	
		LoginPage or = new LoginPage();
		or.findElement();
		or.clickElement();
		BasePage or1 = new BasePage();
		or1.enterText();
		or1.performCommonTask();
		
		

	}

}
