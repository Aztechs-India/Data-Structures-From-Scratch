package com.geeksforgeeks.main;

import com.geeksforgeeks.arrays.SimpleArrayRotation;
import com.geeksforgeeks.graph.Graph;
import com.geeksforgeeks.graphs.CycleDetectionInDirectedGraph;
import com.geeksforgeeks.graphs.CycleDetectionInUndirectedGraph;
import com.geeksforgeeks.interfaces.DataStructuresAlgorithms;

public class DataStructuresAndAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*DataStructuresAlgorithms<Void, Integer[]> data1 = new SimpleArrayRotation();
		Integer[] input = new Integer[] {1, 2, 3, 4, 5};
		data1.getOutput(input);
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]);
		}*/
		
		/*DataStructuresAlgorithms<Boolean, Graph> data2 = new CycleDetectionInUndirectedGraph();
		Graph graph = new Graph(5);
		graph.addUndirectEdge(0, 1);
		graph.addUndirectEdge(0, 2);
		//graph.addUndirectEdge(1, 2);
		graph.addUndirectEdge(0, 3);
		graph.addUndirectEdge(3, 4);
		if(data2.getOutput(graph)) {
			System.out.print("Cycle Exists");
		} else {
			System.out.println("No Cycle");
		}*/
		
		/*DataStructuresAlgorithms<Boolean, Graph> data3 = new CycleDetectionInDirectedGraph();
		Graph graph = new Graph(4);
		graph.addDirectEdge(0, 1);
		graph.addDirectEdge(0, 2);
		graph.addDirectEdge(2, 3);
		//graph.addDirectEdge(2, 0);
		graph.addDirectEdge(3, 3);
		if(data3.getOutput(graph)) {
			System.out.print("Cycle Exists");
		} else {
			System.out.println("No Cycle");
		}*/

		Graph graph = new Graph(4);
		graph.addDirectEdge(0, 1);
		graph.addDirectEdge(0, 2);
		graph.addDirectEdge(2, 3);
		graph.addDirectEdge(2, 0);
		graph.addDirectEdge(3, 3);

		graph.dfs(0);
	}
}
