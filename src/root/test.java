package root;

import read.*;
import search.*;
import sorting.*;
import java.util.*;

public class test {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
	 int option;
	 
		do { 
		 System.out.println("\nSelect an algorithm.\n");
		 System.out.println("1. Read text from a file.\n   Search:\n\t2.  Binary Search.\n\t3.  Sequential Search.");
		 System.out.println("   Sorting:\n\t4.  Selection.\n\t5.  Bubble.\n\t6.  Insertion.\n\t7.  Merge.\n\t8.  Shell.\n\t9.  Quick\n\t10. Heap.");
		 option = in.nextInt();
			 
			switch (option){
			case 1: readTester();
				break;
			case 2: BinarySearchTester();
				break;
			case 3:SequentialSearchTester();
				break;
			}
		}while(option!=11);
		
	}
	
	public static void readTester () {
		
		String dir = "example.txt"; 
		Read readObj = new Read();
		int arr[] = new int[readObj.init(dir)];
		readObj.readFile(dir, arr);
		
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	}
	public static void BinarySearchTester () {
		
		int arr[] = {12,29,31,67,89,90,103,200,509,911}; // Some dummy sorted values. (Binary search requires sorted elements.)
		Binary binaryObj = new Binary();

		System.out.print("Search for # ");
		int key = in.nextInt();
		int element  = binaryObj.search(arr, key);
		
		if(element != -1) {
			System.out.println("Found, it's in index #" + element);
		
		}else System.out.println("Eelement not found");
	}
	
	public static void SequentialSearchTester(){
		
		int arr[] = {25,12,89,1,904,48,72,121,22,88}; // Some dummy values.
		Sequential SeqObj = new Sequential();

		System.out.print("Search for # ");
		int key = in.nextInt();
		int element  = SeqObj.search(arr,key);
		
		if(element != -1) {
			System.out.println("Found, it's in index #" + element);
		
		}else System.out.println("Eelement not found");
	}
	public static void sortTester () {

		int arr[] = {56,7,90,32,34,77,8,900,123,61,109,71,80,1,-56,99,511}; // some dummy values.
		
	}
}
