package array1d;

import java.util.Scanner;

/**
 * This is a library to make a 1D array.
 * NOTE: This is NOT for offical use. This
 * is a toy class for building an array.
 * 
 * @author John
 * @version 1.0
 *
 */

public class SingleDimensionArrayMain {

	public static void main(String[] args) {
		//greet and prompt user
		int size;
		System.out.println("This is a personal 1D data structure.\n"
				+ "NOTE: This is strictly meant for personal use and experimentation. \n");
		
		System.out.print("Please enter the length of the array: ");
		Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		
		SingleDimensionArray SDA = new SingleDimensionArray(size);
		SDA.printArray();
		
		System.out.println("Please insert the value.");
		SDA.insertElement(0, 78);
		SDA.printArray();
		SDA.insertElement(1, 90);
		SDA.printArray();
		SDA.insertElement(2, 89);
		SDA.printArray();
		SDA.insertElement(5, 1);
		SDA.printArray();
		SDA.insertElement(5, -13);
		SDA.printArray();
		SDA.insertElement(100, 60);
		SDA.printArray();
		System.out.println();System.out.println();
		
		System.out.println("Delete the value: ");
		SDA.deleteElement(0);
		SDA.printArray();
		SDA.deleteElement(100);
		SDA.printArray();
		System.out.println();System.out.println();
		
		System.out.println("Access the value: ");
		SDA.accessElement(1);
		SDA.printArray();
		SDA.accessElement(100);
		SDA.printArray();
		System.out.println();System.out.println();
		
		System.out.println("Search for values ");
		SDA.searchValue(Integer.MIN_VALUE);
		SDA.searchValue(0);
		System.out.println();System.out.println();
		
		System.out.println("Delete Array");
		SDA.destroyArray();
		SDA.printArray();
	}
}
