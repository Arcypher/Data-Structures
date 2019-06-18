package array1d;

/**
 * Class containing the methods of 1D array.
 * Design around making a library.
 * 
 * @author John
 * @version 1.0
 *
 */

public class SingleDimensionArray {

	private int[] arr;
	
	/**
	 * Default constructor
	 */
	public SingleDimensionArray() {
		arr = null;
	}
	
	/**
	 * Constructor made with size from user
	 * 
	 * @param size
	 */
	public SingleDimensionArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	/**
	 * Insert element at selected index.
	 * 
	 * If the index is out of bounds, return an exception
	 * Else if, if the index has a value, print that it's full
	 * Else, insert value at the index
	 * 
	 * @param index, value
	 */
	public void insertElement(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
			} else {
				System.out.println("Index is occupied!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index does not exist!");
		}
	}
	
	/**
	 * Delete element at selected index.
	 * 
	 * If index is out of bounds, throw exception
	 * Else, delete value at index and set minimum value 
	 * 
	 * @param index
	 */
	public void deleteElement(int index) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				System.out.println("Value is already at minimum");
			} else {
				arr[index] = Integer.MIN_VALUE;
			}
		} catch (Exception e) {
			System.out.println("Index does not exist!");
		}
	}
	
	/**
	 * Access the element in the index
	 * 
	 * if index does not exist, throw exception.
	 * else, access and print element
	 * 
	 * @param index
	 */
	public void accessElement(int index) {
		try {
			System.out.println("Value at " + index + " is " + arr[index]);
		} catch (Exception e) {
			System.out.println("Index does not exist!");
		}
	}
	
	/**
	 * Search for the index of the element
	 * 
	 * @param value
	 */
	public void searchValue(int value) {
		boolean doesExist = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println(value + " is at index " + i);
				doesExist = true;
			}
		}
		
		if (!doesExist) {
			System.out.println("Value does not exist in array!");
		}
	}
	
	/**
	 * Destroy the array. It should no longer have any values.
	 * 
	 */
	public void destroyArray() {
		arr = null;
	}
	
	/**
	 * Print the array values, index to index
	 * 
	 */
	public void printArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Array does not exist!");
		}
	}
}
