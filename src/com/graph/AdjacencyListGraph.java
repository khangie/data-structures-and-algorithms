package com.graph;

import java.util.LinkedList;

public class AdjacencyListGraph {

    int numNodes;
    
    LinkedList<Integer> adjListArray[]; 
       
    AdjacencyListGraph(int numNodes) { 
    	
        this.numNodes = numNodes; 
          
        // Define the size of array as number of nodes 
        adjListArray = new LinkedList[numNodes]; 
          
        // Create a new list for each node so that adjacent nodes can be stored 
        for (int i = 0; i < numNodes ; i++){ 
            adjListArray[i] = new LinkedList<>(); 
        } 
    } 
    
    
    /**
     * Adds an edge to an undirected graph 
     * 
     * @param src src node
     * @param dest dest node
     */

    public void addEdge(int src, int dest) { 
        
    	// Add an edge from src to dest.  
        this.adjListArray[src].add(dest); 
          
        // Since graph is undirected, add an edge from dest to src also 
        this.adjListArray[dest].add(src); 
        
    } 
    
    public void printGraph() {        
        
    	for (int node = 0; node < this.numNodes; node++) { 
            
    		System.out.println("Adjacency list for node "+ node); 
            
            for (Integer adjNode: this.adjListArray[node]) { 
                System.out.print(adjNode + " -> "); 
            } 
            System.out.println("\n"); 
        } 
    } 
}
