package array;

import java.util.Arrays;

public class MainClass {


	public static void main(String[] args) {
		ArrayClass ac = new ArrayClass(4);
		ac.insert(0, 1);
		ac.insert(1, 12);
		ac.insert(2, 23);
		ac.insert(3, 45);
		ac.insert(4, 98);
		
//		var aman = ac.arr[0];
//		System.out.println(aman);
//		var lalu = ac.arr[4];
		System.out.println(Arrays.toString(ac.arr));
		ac.traverse();
		ac.searchIntArray(90);
		ac.deleteArray(1);
		
		//two dimensional array main class
		
		TwoDArrayInsertion	am = new TwoDArrayInsertion(2,2);
		am.insertValue(0, 0, 3);
		am.insertValue(0, 1, 4);
		am.accesscell(0, 1);
		am.traverse();
		am.searchTwoD(0,0,3);
	
	System.out.println(Arrays.deepToString(am.arr));
		
		
		}

}
