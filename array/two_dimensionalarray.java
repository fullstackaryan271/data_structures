package array;
import java.util.*;
public class TwoDArrayInsertion {
    int arr[][] = null;
	public TwoDArrayInsertion(int numberOfRows, int numberOfColumns)
	{
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertValue(int row, int col, int valueToBeInserted) {
		try {
		if(arr[row][col] == Integer.MIN_VALUE) {
			arr[row][col] = valueToBeInserted;
			System.out.println("value is inserted");
		}
	
	}catch (ArrayIndexOutOfBoundsException e){	
		System.out.println("invalid index for 2d array");
	}
	}
	
public void accesscell(int row, int col) {
	try {
		System.out.println("cell is " + arr[row][col]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index not available");
	}
}
public void traverse() {
	try {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
				}
			System.out.println();
		}
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array index not found");
	}
}
public void searchTwoD(int row, int col, int value) {
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[0].length; j++) {
			if(value == arr[i][j])
				System.out.println("item found" + arr[i][j]);
		}
	}
}



}
