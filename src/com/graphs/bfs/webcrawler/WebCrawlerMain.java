package com.graphs.bfs.webcrawler;

public class WebCrawlerMain {

	/**
	 * Summary
	 * 1) The entire internet can be represented by a directed graph / network
	 *    a) Vertices - the domains, URLs, and websites
	 *    b) Edges - the connections
	 * 2) With breadth-first search, we are able to traverse the web
	 * 3) This is called a web-crawler that can hop from URL to URL and observer the feature of the network
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		WebCrawler crawler = new WebCrawler();
		
		String rootURL = "http://www.bbc.com";
		crawler.discoverWeb(rootURL);
		
	}
	
}
