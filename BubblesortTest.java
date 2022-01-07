package com.te.java.assignment1;

public class BubblesortTest {

	public static void main(String[] args) {
		
		int arr[]= {20,100,500,3,0,80};
		System.out.println("====Array before bubbleSort is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		BubbleSort.bubbleSort(arr);
			System.out.println("Array after bubbleSort");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}