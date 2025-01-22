package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public void MissingNumber(int[] givenNumbers) {
		Arrays.sort(givenNumbers);
		for(int i=0;i<givenNumbers.length;i++) {
			if(givenNumbers[i]!=i+1) {
				int a=i+1;
				System.out.println("The Missing Number is : " + a);
				break;
			}
		}
	}
		public static void main(String[] args) {
			FindMissingElement missingNumber = new 	FindMissingElement();
			int givenNumbers[] = {1,4,3,2,8,6,7};
			missingNumber.MissingNumber(givenNumbers);
		}
		

	}


