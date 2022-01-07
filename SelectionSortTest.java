package com.te.java.assignment1;

public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr1= {20,-5,100,30,0,18,27};
		System.out.println("Array before sort:");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
		SelectionSort.selectionSort(arr1);
		System.out.println("Array after sorting");
		for(int i:arr1) {
			System.out.print(i+" ");
		}
	}
}
