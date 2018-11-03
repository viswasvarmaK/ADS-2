import java.util.Scanner;
class PageRank {
	int outDegree;
	int inDegree;
	Digraph dg;
	HashTable<Integer, ArrayList<Integer>> incomingVertices;
	PageRank(Digraph digraph, Integer vertex) {
		this.outDegree = digraph.outDegree(vertex);
		this.inDegree = digraph.inDegree(vertex);
		this.dg = digraph;
		incomingVertices = new HashTable<>();
		for (int i = 0; i < vertices; i++) {
			for (Integer k : digraph.adj(i)) {
				if (incomingVertices.contains(k)) {
					incomingVertices.get(k).add(i);
				} else {
					incomingVertices.put(k);
				}
			}
		}
		System.out.println(outDegree + "-" + inDegree);
	}
	double getPR(int vertex) {
		if (outDegree == 0) {
			return 0.0;
		}
		double initial = 1 / dg.V();
		double rank = 0;
		for (int k = 0; k < )

	}
}

class WebSearch {

}


public class Solution {
	public static void main(String[] args) {
		// read the first line of the input to get the number of vertices

		// iterate count of vertices times 
		// to read the adjacency list from std input
		// and build the graph
		
		
		// Create page rank object and pass the graph object to the constructor
		
		// print the page rank object
		
		// This part is only for the final test case
		
		// File path to the web content
		String file = "WebContent.txt";
		
		// instantiate web search object
		// and pass the page rank object and the file path to the constructor
		
		// read the search queries from std in
		// remove the q= prefix and extract the search word
		// pass the word to iAmFeelingLucky method of web search
		// print the return value of iAmFeelingLucky
		Scanner Scan = new Scanner(System.in);
		int vertices = integer.parseInt(scan.nextLine());
		Digraph digraph = new Digraph(vertices);
		int verticesCopy= vertices;
		while(verticesCopy > 0) {
			String[] vertex = scan.nextLine().split(" ");
			int v = Integer.parseInt(vertex[0]);
			for (int i =1; i < vertex.length; i++) {
				digraph.addEdge(v, Integer.parseInt(vertex[w]));
			}
			verticesCopy--;
		}
		System.out.println(digraph.V() + " vertices " + digraph.E() + " edges ");
		// for (int j = 0; j < vertices; j++) {
		// 	System.out.println(j + ":");
		// 	PageRank pr = new PageRank(digraph, i);
		// 	prlist.add(pr);
		// 	for (int )
		// }
	}
}
