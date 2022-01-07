package com.te.java.assignment1;

public class InsertionTest {

	public static void main(String[] args) {
	int arr[]= {100,2,80,60,500,3,40,1};
		InsertionSort  insertionsort=new InsertionSort();
		insertionsort.Sort(arr);
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}
	}
}
