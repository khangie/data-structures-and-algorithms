package com.graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchMain {

	/**
	 * Summary
	 * 1) Depth-first search (DFS) is a widely used graph traversal algorithm
	 * 2) It explores as far as possible along each branch before backtracking
	 * 3) In contrast, bread-first search (BFS) is a layer-by-layer algorithm
	 * 4) Time complexity is O(V+E)
	 * 5) Memory complexity is a bit better than BFS
	 * 6) DFS can be implemented recursively or iteratively
	 * 7) Both implementations have similar performance
	 * 8) The recursive method is preferred:
	 *    a) It is simpler to implement
	 *    b) The iterative method requires explicit definition of stacks whereas the recursive method implicitly uses stacks
	 * 9) DFS uses stacks whereas BFS uses queues as the abstract data type
	 * 10) We can also search backwards using DFS
	 * 
	 * Applications for DFS
	 * 1) Topological ordering
	 * 2) Kosaraju algorithm for finding strongly connected components for use in recommendation systems
	 * 3) Generating mazes OR finding a way out of a maze
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		
		v1.addNeighber(v2);
		v1.addNeighber(v3);
		v3.addNeighber(v4);
		v4.addNeighber(v5);
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(v1);
		vertexList.add(v2);
		vertexList.add(v3);
		vertexList.add(v4);
		vertexList.add(v5);
		
		DepthFirstSearch dfs = new DepthFirstSearch();
		
		System.out.println("Recursive implementation");
		dfs.runSearchRecursive(vertexList);
		
		for (Vertex vertex : vertexList) {
			vertex.setVisited(false);
		}
		
		System.out.println("Stack implementation");
		dfs.runSearchWithStack(vertexList);
		
	}
	
}
