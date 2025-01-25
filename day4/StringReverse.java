package week1.day4;

public class StringReverse {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
		char[] compName = companyName.toCharArray();
		for (int i=compName.length-1;i>=0;i--) {
			System.out.println(compName[i]);
		}
	}

}
