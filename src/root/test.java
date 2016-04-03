package root;

import read.*;
import search.*;
import sorting.*;
import java.util.*;

public class test {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
//		readTester();
//		BinarySearchTester();
		SequentialSearchTester();
		
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
}
