package com.graph.dfs;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

	private Stack<Vertex> stack;
	
	public DepthFirstSearch() {
		this.stack = new Stack<>();
	}
	
	public void runSearchRecursive(List<Vertex> vertexList) {
		
		// The for loop is necessary in case we have several disconnected clusters
		for (Vertex v:vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsRecursive(v);
			}
		}
		
	}
	
	public void runSearchWithStack(List<Vertex> vertexList) {
		
		// The for loop is necessary in case we have several disconnected clusters
		for (Vertex v:vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
		
	}

	private void dfsRecursive(Vertex rootVertex) {
		
		System.out.println(rootVertex);
		
		for (Vertex currentVertex : rootVertex.getNeighborList()) {
			
			if (!currentVertex.isVisited()) {
				currentVertex.setVisited(true);
				dfsRecursive(currentVertex);
			}
			
		}
		
	}
	
	private void dfsWithStack(Vertex rootVertex) {
		
		this.stack.add(rootVertex);
		rootVertex.setVisited(true);
		
		while (!this.stack.isEmpty()) {
			
			Vertex currentVertex = this.stack.pop();
			System.out.println(currentVertex);
			
			for (Vertex v : currentVertex.getNeighborList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}	
		}
	}
	
}
