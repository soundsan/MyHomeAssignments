package week1.day4;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str = "We learn Java basics as part of java sessions in java week1";
		char[] charArray1 = str.toCharArray();
		System.out.println(charArray1);
		String removeDuplicate = str.replaceAll("java", "");
		System.out.println(removeDuplicate);
		}

}
