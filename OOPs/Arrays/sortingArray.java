package Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] intArray = getIntergers(5);
		printArray(intArray);
		int[] intSorted = sortIntegers(intArray);
		System.out.println("After Sorting :");
		printArray(intSorted);
		
	}
	private static Scanner scanner=new Scanner(System.in);
	public static int[] getIntergers(int num) {
		int[] arr=new int[num];
		System.out.println("Enter "+num+" integers :\r"); //\r to read the user_input from the new line 
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("The array elements are : "+arr[i]);
		}
	}
	public static int[] sortIntegers(int[] arr) {
		int[] sortedArray = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			sortedArray[i]=arr[i];
		}
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0;i<sortedArray.length-1;i++) {
				if(sortedArray[i]<sortedArray[i+1]) {   //to make it increasing order use >
					temp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=temp;
					flag=true;
				}
			}
		}
		return sortedArray;
	}

}
