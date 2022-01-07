package com.te.java.assignment1;

public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n= arr.length;
		int temp=0;
		for (int i=0;i<=arr.length;i++) {
			for(int j=1;j<=n-1;j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
