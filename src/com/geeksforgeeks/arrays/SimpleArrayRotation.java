package com.geeksforgeeks.arrays;

import com.geeksforgeeks.interfaces.DataStructuresAlgorithms;
import java.util.Scanner;

public class SimpleArrayRotation implements DataStructuresAlgorithms<Void, Integer[]> {

	@Override
	public Void getOutput(Integer[] input) {
		// TODO Auto-generated method stub
		int n = input.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rotation By How many elements ?");
		int d = sc.nextInt();
		//Auxiliary Array For d Elements
		int[] firstDElements = new int[d];
		//Copy First d Elements into Auxiliary Array
		for(int i=0; i<d; i++) {
			firstDElements[i] = input[i];
		}
		for(int i=d; i<n; i++)
		{
			input[i-d] = input[i];
		}
		for(int i=n-d; i<n; i++)
		{
			input[i] = firstDElements[i-d-1];
		}
		sc.close();
		return null;
	}

}
