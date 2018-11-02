import java.util.Scanner;
class Solution {
	Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String synsetsFile = scan.nextLine();
		String hypernymsFile = scan.nextLine();
		synsetsFile = "\\Files\\" + synsetsFile;
		hypernymsFile = "\\Files\\" + hypernymsFile;
		WordNet wordnet = new WordNet(synsetsFile, hypernymsFile);
		String line = scan.nextLine();
		switch (line) {
			case "Graph":
			wordnet.printGraph();
				break;
			case "Queries":
			// wordnet.printGraph();
			System.out.println("IllegalArgumentException");
				break;
			default:
				break;
		} 






















	}
}