package practice;
import java.util.*;
// Java program to demonstrate the working of ArrayList
	import java.io.*;
	import java.util.*;
	public class ArrayListxy{
		public static void main(String[] args)
		{
			// Size of the
			// ArrayList
			int n = 5;

			// Declaring the ArrayList with
			// initial size n
			ArrayList<Integer> arr1 = new ArrayList<Integer>(n);

			// Declaring the ArrayList
			ArrayList<Integer> arr2 = new ArrayList<Integer>();

			// Printing the ArrayList
			System.out.println("Array 1:" + arr1);
			System.out.println("Array 2:" + arr2);

			// Appending new elements at
			// the end of the list
			for (int i = 1; i <= n; i++) {
				arr1.add(i);
				arr2.add(i);
			}
			System.out.println(arr1.get(4));
			arr1.set(4,1);
			System.out.println(arr1.size());
			System.out.println(arr2.remove(0));
			System.out.println(arr2.set(3, 7));
			System.out.println(arr2.lastIndexOf(3));
			System.out.println(arr1.isEmpty());
			System.out.println(arr1.size());
			// Printing the ArrayList
			System.out.println("Array 1:" + arr1);
			System.out.println("Array 2:" + arr2);
		}
	}

