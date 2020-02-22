/**
 * 
 */
package com.geeksforgeeks.graphs;

import java.util.*;

import com.geeksforgeeks.graph.Graph;
import com.geeksforgeeks.interfaces.DataStructuresAlgorithms;

/**
 * @author Deepak
 *
 */
public class CycleDetectionInUndirectedGraph implements DataStructuresAlgorithms<Boolean, Graph> {

	@Override
	public Boolean getOutput(Graph input) {
		// TODO Auto-generated method stub
		int vertices = input.getVertices();
		boolean[] visited = new boolean[vertices];
		for(int ind = 0; ind < vertices; ind++)
		{
			if(!visited[ind]) {
				if(isCyclicUtil(input, visited, ind, -1))
				{
					return true;
				}
			}
		}
		return false;
	}

	private boolean isCyclicUtil(Graph input, boolean[] visited, int src, int parent) {
		// TODO Auto-generated method stub
		visited[src] = true;
		Iterator<Integer> adjacents = input.getAdjacencyList()[src].listIterator();
		while(adjacents.hasNext()) {
			int adjacent = adjacents.next();
			if(!visited[adjacent]) {
				if(isCyclicUtil(input, visited, adjacent, src)) {
					return true;
				}
			} else if(adjacent != parent) {
				return true;
			}
		}
		return false;
	}

}
