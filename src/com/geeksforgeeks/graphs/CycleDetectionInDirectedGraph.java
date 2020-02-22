/**
 * 
 */
package com.geeksforgeeks.graphs;

import java.util.Iterator;

import com.geeksforgeeks.graph.Graph;
import com.geeksforgeeks.interfaces.DataStructuresAlgorithms;

/**
 * @author Deepak
 *
 */
public class CycleDetectionInDirectedGraph implements DataStructuresAlgorithms<Boolean, Graph> {

	@Override
	public Boolean getOutput(Graph input) {
		// TODO Auto-generated method stub
		int vertices = input.getVertices();
		boolean[] visited = new boolean[vertices];
		boolean[] callStack = new boolean[vertices];
		for(int ind = 0; ind < vertices; ind++) {
			if(!visited[ind]) {
				if(isCyclic(input, ind, visited, callStack)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean isCyclic(Graph graph, int src, boolean[] visited, boolean[] callStack) {
		visited[src] = true;
		callStack[src] = true;
		
		Iterator<Integer> adjacents = graph.getAdjacencyList()[src].listIterator();
		while(adjacents.hasNext()) {
			int adjacent = adjacents.next();
			if(!visited[adjacent]) {
				if(isCyclic(graph, adjacent, visited, callStack)) {
					return true;
				}
			} else if(callStack[adjacent]) {
				return true;
			}
		}
		callStack[src] = false;
		return false;
	}

}
