package com.graph.bfs;

public class BreadthFirstSearchMain {
	
	/**
	 * Summary
	 * 1) Running time complexity is O(V+E)
	 * 2) Memory complexity is not good since we have to store lots of references
	 * 3) This is why Depth-first search (DFS) is usually preferred
	 * 4) Constructs a shortest path
	 * 5) Implementation
	 *    a) We have an empty queue at the beginning and we keep checking whether we have visited the given node or not
	 *    b) Keep iterating until queue is not empty
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		BreadthFirstSearch breadFirstSearch = new BreadthFirstSearch();
		
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		
		vertex1.addNeighborVertex(vertex2);
		vertex1.addNeighborVertex(vertex4);
		vertex4.addNeighborVertex(vertex5);
		vertex2.addNeighborVertex(vertex3);
		
		breadFirstSearch.runSearch(vertex1);
		
	}


}
