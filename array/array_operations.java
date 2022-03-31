package array;
import java.util.Arrays;

public class ArrayClass {
int arr[] = null;

public ArrayClass(int sizeOfArray) {
	this.arr = new int[sizeOfArray];
	for(int i=0; i<arr.length; i++) {
		arr[i] = Integer.MIN_VALUE;
	}
}
public void insert(int location, int valueToInsert) {
	try {
	if(arr[location] == Integer.MIN_VALUE) {
		arr[location] = valueToInsert;
		System.out.println("successfully inserted");
	}
	
	else {
		System.out.println("already full");
	}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("invalid index");
	}
}
public void traverse(){
	try {
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i] + " ");
	}
	}catch(Exception e) {
		System.out.println("no array to traverse");
	}
}
public void searchIntArray(int valueToBeSearched) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == valueToBeSearched) {
				System.out.println("no. is found at index" + i);
				return;
			}
		}
	System.out.println("not found");	
}
public void deleteArray(int valueToBeDeleteIndex) {
	try {
        arr[valueToBeDeleteIndex] = Integer.MIN_VALUE;
		System.out.println("not found and not deleted");
	
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("hence array of index not found");
	}
}
}
