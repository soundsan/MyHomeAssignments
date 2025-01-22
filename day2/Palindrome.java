package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		for (int i=10;i<=100;i++) {
			int n = i;
			int temp = n;
			int rev = 0;
			while (n>0) {
				int rem = n%10;
				rev = rev*10+rem;
				n = n/10;
			}
			if (temp==rev) {
				System.out.println(temp+" ");
			}
		}
	}

}
