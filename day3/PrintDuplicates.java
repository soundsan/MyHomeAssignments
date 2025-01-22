package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] number = {2,5,7,7,5,9,2,3};
        Arrays.sort(number);
		int length = number.length;
		for (int i=0;i<length;i++) {
			for (int j = i+1;j<length;j++) {
				if (number[i]==number[j]) {
					System.out.println("Duplicate value is :" + number[j]);
				}
			}
		}
	}

}
