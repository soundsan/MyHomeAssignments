package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 6,c=0;
		for (int i= 1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("The given number " + n + " is prime");
		}
		else {
			System.out.println("The given number " + n + " is not prime");
		}
	}

}
