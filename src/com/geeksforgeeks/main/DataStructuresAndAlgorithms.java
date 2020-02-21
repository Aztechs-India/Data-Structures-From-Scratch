package com.geeksforgeeks.main;

import com.geeksforgeeks.arrays.SimpleArrayRotation;
import com.geeksforgeeks.interfaces.DataStructuresAlgorithms;

public class DataStructuresAndAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataStructuresAlgorithms<Void, Integer[]> data1 = new SimpleArrayRotation();
		Integer[] input = new Integer[] {1, 2, 3, 4, 5};
		data1.getOutput(input);
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}
	}
}
