public class BoggleSolver {
	TrieST<Integer> triest = new TrieST<>();
	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A through Z.)
	public BoggleSolver(String[] dictionary) {
		int score = 0;
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].length() == 3 || dictionary[i].length() == 4) {
				score = 1;
			}
			if (dictionary[i].length() == 5) {
				score = 2;
			}
			if (dictionary[i].length() == 6) {
				score = 3;
			}
			if (dictionary[i].length() == 7) {
				score = 5;
			}
			if (dictionary[i].length() >= 8) {
				score = 11;
			} else {
				score = 0;
			}
			triest.put(dictionary[i], score);	
		}
	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable.
	public Iterable<String> getAllValidWords(BoggleBoard board) {
		return new Bag<String>();
	}

	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A through Z.)
	public int scoreOf(String word) {
		if (triest.contains(word)) {
			return triest.get(word);
	    }
	    return 0;
	}
	
}