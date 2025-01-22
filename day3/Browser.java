package week1.day3;

public class Browser {
	
	public String launchBrowser() {
		return "Google";
	}
	 
	public void loadUrl() {
		System.out.println("Loaded successfully");
	}

	public static void main(String[] args) {
		Browser launchOpt = new Browser();
		System.out.println(launchOpt.launchBrowser());
        launchOpt.loadUrl();
	}

}
