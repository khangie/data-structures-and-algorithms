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
	 * 
	 * Adjacency Matrix Implementation
	 * 1) We have an "A" matrix constructed out of the vertices of the graph
	 *    a) The A(i,j) value in the matrix is 1 if there is a connection between node i and node j
	 *    b) Otherwise, A(i,j) is 0   
	 * 2) PROS
	 *    a) Representation is easier to implement and follow. 
	 *    b) Removing an edge takes O(1) time. 
	 *    c) Queries like whether there is an edge from vertex ‘u’ to vertex ‘v’ are efficient and can be done O(1).
     * 3) CONS
     *    a) Consumes more space O(N^2). 
     *    b) Even if the graph is sparse(contains less number of edges), it consumes the same space. 
     *    c) Adding a vertex is O(N^2) time.
	 * 
	 * Adjacency List Implementation
	 * 1) We create a Vertex class which stores the neighbors accordingly
	 * 2) PROS
	 *    a) Saves space O(|N|+|E|). 
	 *    b) In the worst case, there can be C(N, 2) number of edges in a graph thus consuming O(N^2) space. 
	 *    c) Adding a vertex is easier.
	 *  
	 * Example Applications
	 * 1) Social Network
	 *    a) In these networks, each person is represented with a node.
	 *    b) Each node contains information like a person id, name, gender, and location.
	 *    c) The edges represent a relationship or a friendship.
	 * 2) Road Network
	 *    a) Each city can be represented as vertices
	 *    b) The road used to connect them are edges
	 * 
	 * Breadth-first search (BFS)
	 * 1) Running time complexity is O(V+E)
	 * 2) Memory complexity is not good since we have to store lots of references
	 * 3) This is why Depth-first search (DFS) is usually preferred
	 * 4) Constructs a shortest path
	 * 5) Implementation
	 *    a) We have an empty queue at the beginning and we keep checking whether we have visited the given node or not
	 *    b) Keep iterating until queue is not empty
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
