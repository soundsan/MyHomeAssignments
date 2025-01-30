package week2.day3;

public class TestData {
	
	//Enter Credentials
	public void enterCredentials() {
		System.out.println("Enter the Details:");
	}
	
	//Navigating to Home Page
	public void navigateToHomePage() {
		System.out.println("Navigating to Home Page");
	}

	public static void main(String[] args) {
		TestData dataValues = new TestData();
		dataValues.enterCredentials();
		dataValues.navigateToHomePage();
	}

}
