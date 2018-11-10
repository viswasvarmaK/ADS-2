
/**

 *class for edge.

 */

class Edge implements Comparable<Edge> {

    /**

     *the variable to store.

     *vetexOne

     */

    private int vertexOne;

    /**

     *the variable to store.

     *other vertex.

     */

    private int vertexTwo;

    /**

     *the variable to store the weight of.

     *each edge.

     */

    private double weight;

    /**

     *the constructor to initialize the.

     *vertices and their edge weight

     * @param      v  vertexOne

     * @param      w  vertexTwo

     * @param      cost  weight of edge

     */

    Edge(final int v, final int w,

         final double cost) {

        this.vertexOne = v;

        this.vertexTwo = w;

        this.weight = cost;

    }

    /**

     *this method returns the weight of edge.

     *

     * @return  weight of edge

     */

    public double weight() {

        return this.weight;

    }

    /**

     *this method returns one vertex.

     *

     * @return  one end of edge.

     */

    public int either() {

        return vertexOne;

    }

    /**

     *returns the other end of vertex.

     *

     * @param      v already connected vertex

     *

     * @return another vertex

     */

    public int other(final int v) {

        if (v == vertexOne) {

            return vertexTwo;

        } else {

            return vertexOne;

        }

    }

    /**

     *

     *the method is to compare the two weights.

     *of edges.

     * @param      that  another edge

     *

     * @return  if this edge is  greater than that.

     * returns 1.

     * equal returns zero.

     */

    public int compareTo(final Edge that) {

        if (this.weight < that.weight) {

            return -1;

        } else if (this.weight > that.weight) {

            return 1;

        } else {

            return 0;

        }

    }

    public String toString() {

        return String.format("%d-%d %.5f",

         vertexOne, vertexTwo, weight);

    }

}