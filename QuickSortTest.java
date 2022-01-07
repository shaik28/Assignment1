package com.te.java.assignment1;

public class QuickSortTest {

	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	    public static void main(String[] args) {  
	    int a[] = { 13, 18, 27, 2, 19, 25 };  
	    int n = a.length;  
	    System.out.println("\nBefore sorting array elements are - ");  
	    QuickSortTest q1 = new QuickSortTest(); 
	    QuickSort q2=new QuickSort();
	    q1.printArr(a, n);  
	    q2.quick(a, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are - ");  
	    q1.printArr(a, n);  
	    System.out.println();  
	    }  
	}  

