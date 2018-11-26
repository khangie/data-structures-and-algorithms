package com.graph;

public class GraphMain {

	/**
	 * Summary
	 * 1) A graph "G" is an ordered pair of a set "V" of vertices with a set "E" of edges.
	 *    a) G = (V, E)
	 * 2) A tree is a type of graph.
	 * 3) Edges
	 *    a) A DIRECTED edge is one way
	 *    b) An UNDIRECTED edge is two way
	 * 4) Types of graphs
	 *    a) A DIRECTED GRAPH has pairs of vertices (u,v)
	 *    b) An UNDIRECTED GRAPH has pairs of undirected vertices (u,v) and (v,u)
	 * 5) Adjacency Matrix Implementation
	 *    a) PROS
	 *       1) Representation is easier to implement and follow. 
	 *       2) Removing an edge takes O(1) time. 
	 *       3) Queries like whether there is an edge from vertex ‘u’ to vertex ‘v’ are efficient and can be done O(1).
     *    b) CONS
     *       1) Consumes more space O(N^2). 
     *       2) Even if the graph is sparse(contains less number of edges), it consumes the same space. 
     *       3) Adding a vertex is O(N^2) time.
	 * 6) Adjacency List Implementation
	 *    a) PROS
	 *       1) Saves space O(|N|+|E|). 
	 *       2) In the worst case, there can be C(N, 2) number of edges in a graph thus consuming O(N^2) space. 
	 *       3) Adding a vertex is easier.
	 *    
	 * 
	 * Example Application
	 * 1) Social Network
	 *    a) In these networks, each person is represented with a node.
	 *    b) Each node contains information like a person id, name, gender, and location.
	 *    c) The edges represent a relationship or a friendship.
	 * 2) Road Network
	 *    a) Each city can be represented as vertices
	 *    b) The road used to connect them are edges
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
        AdjacencyListGraph graph = new AdjacencyListGraph(5); 
        graph.addEdge(0, 1); 
        graph.addEdge(0, 4); 
        graph.addEdge(1, 2); 
        graph.addEdge(1, 3); 
        graph.addEdge(1, 4); 
        graph.addEdge(2, 3); 
        graph.addEdge(3, 4); 
       
        graph.printGraph(); 
		
	}
	
}
