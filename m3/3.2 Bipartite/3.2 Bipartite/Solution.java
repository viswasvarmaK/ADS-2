/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * class for SOlution
 */
public final class Solution {
    /**.
     * Constructs the object.
     * @author Viswas
     */
    private Solution() {

    }
    /**.
     * main function which checks if graph is bipartite or not
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberofvertices = scan.nextInt();
        int numberofedges = scan.nextInt();
        scan.nextLine();
        Graph graph = new Graph(numberofvertices);
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(" ");
            graph.addEdge(Integer.parseInt(tokens[0]),
                          Integer.parseInt(tokens[1]));
        }
        Bipartite bipartite = new Bipartite(graph);
        if (bipartite.isBipartite()) {
            System.out.println("Graph is bipartite");
        } else {
            System.out.println("Graph is not a bipartite");
        }
    }
}

case "DirectedPaths":
            String[] queries = s.nextLine().split(" ");
            dijkstraobject = new DijkstrasSP(ewg, Integer.parseInt(queries[0]));
            if(dijkstraobject.hasPathTo(Integer.parseInt(queries[1]))) {
                System.out.println(dijkstraobject.distance(Integer.parseInt(queries[1])));
            } else {
                System.out.println("No Path Found.");
            }
            break;
        case "ViaPaths":
            String[] viapath = s.nextLine().split(" ");
            dijkstraobject = new DijkstrasSP(ewg, Integer.parseInt(viapath[0]));
            if(dijkstraobject.hasPathTo(Integer.parseInt(viapath[2]))) {
                if(dijkstraobject.viaPath(Integer.parseInt(viapath[2]), Integer.parseInt(viapath[1]))) {
                    System.out.println(dijkstraobject.distance(Integer.parseInt(viapath[2])));
                    dijkstraobject.printPath(Integer.parseInt(viapath[2]));
                }
            } else {
                    System.out.println("No Path Found.");
            }

            break;
        default:
            break;