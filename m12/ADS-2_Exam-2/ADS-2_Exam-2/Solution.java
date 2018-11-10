import java.util.Scanner; 
final class Solution {

    private Solution() {
    }
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int vertices = Integer.parseInt(s.nextLine());
        int edges = Integer.parseInt(s.nextLine());
        Edge e;
        EdgeWeightedGraph ewg
        = new EdgeWeightedGraph(vertices, edges);
        // DijkstrasSP dijkstraobject;
        for(int i = 0; i < edges; i++) {
            String[] tokens = s.nextLine().split(" ");
            e = new Edge(Integer.parseInt(tokens[0]),
                               Integer.parseInt(tokens[1]),
                               Double.parseDouble(tokens[2]));
            ewg.addEdge(e);
        }
        String caseToGo = s.nextLine();
        switch (caseToGo) {
        case "Graph":
            System.out.println(ewg);
            break;
        case "DirectedPaths":
                System.out.println("No Path Found.");

            break;
        case "ViaPaths":
                    System.out.println("No Path Found.");
            break;
        default:
            break;
        }
    }

}