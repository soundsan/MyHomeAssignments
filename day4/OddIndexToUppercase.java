package week1.day4;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		//String str = test.toLowerCase();	
		for (int i=0;i<ch.length;i=i+2) {
			ch[i] = Character.toUpperCase(ch[i]);
			}
		System.out.println(new String(ch));
		}

}
