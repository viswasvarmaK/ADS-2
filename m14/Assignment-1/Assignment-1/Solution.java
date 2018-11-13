import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		String[] words = loadWords();
        Scanner scan = new Scanner(System.in);
        TST<Integer> tst = new TST<>();
        String prefix = scan.nextLine();
        for (int i = 0; i<words.length; i++) {
            for (int j = 0; j<words[i].length();j++ ) {
                tst.put(words[i].substring(j),j);
            }
            //tst.put(words[i],i);
            
        }
		//Your code goes here...
        for (String str : tst.keysWithPrefix(prefix) ) {
            System.out.println(str);
        }
	}

	public static String[] loadWords() {
		In in = new In("/Files/dictionary-algs4.txt");
		String[] words = in.readAllStrings();
		return words;
	}
}
























































// /**.
//  * imports Scanner package
//  */
// import java.util.Scanner;
// /**.
//  * Class for solution.
//  * @author Viswas
//  */
// public final class Solution {
//     /**.
//      * Constructs the object for SOlution
//      */
//     private Solution() {

//     }
//     /**.
//      * main function which performs the operations
//      *
//      * @param      args  The arguments
//      */
//     public static void main(final String[] args) {
//         String[] words = loadWords();
//         Scanner scan = new Scanner(System.in);
//         String prefix = scan.nextLine();
//         TST<Integer> tst = new TST<>();
//         for (int i = 0; i < words.length; i++) {
//             for (int j = 0; j < words[i].length(); j++) {
//                 tst.put(words[i].substring(j), j);
//             }
//         }
//         for (String str : tst.keysWithPrefix(prefix)) {
//             System.out.println(str);
//         }
//     }
//     /**.
//      * Loads words.
//      *
//      * @return     { returns words from file }
//      */
//     public static  String[] loadWords() {
//         In in = new In("/Files/dictionary-algs4.txt");
//         String[] words = in.readAllStrings();
//         return words;
//     }
// }

