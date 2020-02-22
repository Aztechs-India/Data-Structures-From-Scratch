/**
 * 
 */
package com.geeksforgeeks.graph;

import java.util.*;

/**
 * @author Deepak
 *
 */
public class Graph {
	private int vertices;
	private LinkedList<Integer>[] adjacencyList;
	
	public int getVertices() {
		return vertices;
	}

	public LinkedList<Integer>[] getAdjacencyList() {
		return adjacencyList;
	}

	public Graph(int vertices) {
		this.vertices = vertices;
		initialiseAdjacencyList();
	}

	private void initialiseAdjacencyList() {
		// TODO Auto-generated method stub
		adjacencyList = new LinkedList[vertices];
		for(int ind = 0; ind < vertices; ind++) {
			adjacencyList[ind] = new LinkedList<Integer>();
		}
	}
	
	public void addDirectEdge(int src, int dest) {
		adjacencyList[src].add(dest);
	}
	
	public void addUndirectEdge(int src, int dest) {
		adjacencyList[src].add(dest);
		adjacencyList[dest].add(src);
	}
	
}
