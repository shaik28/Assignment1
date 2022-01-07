package com.te.java.assignment1;

public class MergeSortTest {
 
		void printArray(int a[], int n)  
		{  
		    int i;  
		    for (i = 0; i < n; i++)  
		        System.out.print(a[i] + " ");  
		}  
		  
		public static void main(String args[])  
		{  
		    int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 };  
		    int n = a.length;  
		    MergeSortTest m1 = new MergeSortTest();
		    MergeSort m2=new MergeSort();
		    System.out.println("\nBefore sorting array elements are - ");  
		    m1.printArray(a, n);  
		   m2.mergeSort(a, 0, n - 1);
		   System.out.println();
		    System.out.println("\nAfter sorting array elements are - ");  
		    m1.printArray(a, n);  
		    System.out.println("");  
		}	  
		  }  
