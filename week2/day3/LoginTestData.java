package week2.day3;

public class LoginTestData extends TestData {
	
	//TestData - Parent
	//LoginTestData - Child
	
	//Enter the UserName
	public void enterUsername() {
		System.out.println("Enter the Username:");
	}
	
	//Enter the Password
	public void enterPassword() {
		System.out.println("Enter your Password:");
	}

	public static void main(String[] args) {
		LoginTestData userValues = new LoginTestData(); 
		userValues.enterUsername();
		userValues.enterPassword();
		userValues.enterCredentials();
		userValues.navigateToHomePage();
	}

}
