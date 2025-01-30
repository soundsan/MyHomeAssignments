package week2.day3;

public class LoginPage extends BasePage {
	
	@Override
	
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Performing Common Tasks");
	}

	public static void main(String[] args) {
		LoginPage page = new LoginPage();
		page.performCommonTasks();
	}

}
