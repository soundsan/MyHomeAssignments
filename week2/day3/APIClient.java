package week2.day3;

public class APIClient {
	
	public void sendRequest(String a) {
		System.out.println(a);
	}
	
	public void sendRequest(String a,String b,boolean c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		APIClient poly = new APIClient();
		poly.sendRequest("One String Argument");
		poly.sendRequest("String1" +" "+ "String2"+" "+ false);

	}

}
