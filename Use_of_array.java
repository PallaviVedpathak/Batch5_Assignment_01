package com.company;
import java.util.Arrays;

class ArrOp{
	
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}

public class Use_of_array {
	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=ArrOp.copyOf(arr);
	}
}
}
