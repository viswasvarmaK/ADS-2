/**
 * @author Viswas
 */
import java.util.Scanner;
/**
 *library
 */
import java.util.Arrays;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * It is thge main method in this we can read the
     * inputs from the input files and then converted into
     * the tokens and then send as parameters to the spcified
     * methods of the classes.
     * 
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Graph G = new Graph(scan);
    }
}
