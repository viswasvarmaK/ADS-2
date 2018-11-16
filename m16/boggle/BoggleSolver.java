public class BoggleSolver {
	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A through Z.)
	TrieST<Integer> tst = new TrieST<>();
	int row, col;
	boolean[][] visited;
	public BoggleSolver(String[] dictionary) {
		//int[] count = {0,0,0,1,1,2,3,5,11};
		int count = 0;
		for (int i = 0; i < dictionary.length ; i++ ) {
			//System.out.println("dictionary words....." +dictionary[i]);

			if (dictionary[i].length() == 0 || dictionary[i].length() == 1 || dictionary[i].length() == 2) {
				count = 0;
			} else if (dictionary[i].length() == 3 || dictionary[i].length() == 4) {
				count = 1;
			} else if (dictionary[i].length() == 5) {
				count = 2;
			} else if (dictionary[i].length() == 6) {
				count = 3;
			} else if (dictionary[i].length() == 7) {
				count = 5;
			} else if (dictionary[i].length() >= 8) {
				count = 11;
			}
			// score = count[dictionary[i].length()];
			//System.out.println("word .." +dictionary[i]);
			//System.out.println("count ..." +count);
			tst.put(dictionary[i], count);


		}

	}
	private  void findwords(BoggleBoard board, int i, int j,
	                        Queue queue, String sb) {
		if (isValid(sb)) {
			queue.enqueue(sb);
		}
		int rows = board.rows();
		int cols = board.cols();
		visited[i][j] = true;
		for (int row = i - 1; row <= i + 1 && row < rows; row++) {
			for (int col = j - 1; col <= j + 1 && col < cols; col++ ) {
				if (row >= 0 && col >= 0 && !visited[row][col]) {
					String sb1 = appendChar(sb, board.getLetter(row, col));
					findwords(board, row, col, queue, sb1);
				}

			}
		}
		visited[i][j] = false;

	}
	public  String appendChar(String s, char c) {
		if (c == 'Q') {
			return s + "QU";
		}
		return s + c;
	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable.
	public Iterable<String> getAllValidWords(BoggleBoard board) {
		if (board == null) {
			System.out.println("board is null");

		}
		// Initialize the queue
		Queue<String> queue = new Queue<>();
		// Initialise the boolean board;

		// get the rows
		int rows = board.rows();

		// get the cols
		int cols = board.cols();
		visited = new boolean[rows][cols];

		// iterate the board and get each char from the board and call the method with the particualr ltter
		// by passing board, queue, row, col, string, visited
		for (int row = 0; row < rows ; row++ ) {
			for (int col = 0; col < cols ; col++ ) {
				String s = appendChar("", board.getLetter(row, col));
				findwords(board, row, col, queue, s);
			}
		}
		return queue;
	}
	private boolean isValid(String key) {
		if (key.length() <= 2) {
			return false;
		}
		return tst.contains(key);
	}

	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A through Z.)
	public int scoreOf(String word) {
		if (tst.contains(word)) {
			return tst.get(word);
		}

		return 0;
	}
}