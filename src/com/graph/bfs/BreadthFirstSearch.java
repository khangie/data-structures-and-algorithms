package com.graph.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void runSearch(Vertex root) {
		
		// Instantiate a queue implemented by a linked list
		Queue<Vertex> queue = new LinkedList<>();
		
		// Set root to visited because we start at the root
		root.setVisited(true);
		
		// Add the root to the queue
		queue.add(root);
		
		while (!queue.isEmpty()) {
			
			// Get the next vertex from the queue
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex + " ");
			
			// Visit each of the neighbors
			for (Vertex v: actualVertex.getNeighborList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}
}
