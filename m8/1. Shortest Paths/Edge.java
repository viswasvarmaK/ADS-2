/**
 * Class for edge.
 */
public class Edge implements Comparable<Edge> {
   /**
    * vertex v.
    */
    private final int v;
    /**
     * vertex w.
     */
    private final int w;
    /**
     * weight.
     */
    private final double weight;

    /**
     * Initializes an edge between vertices {@code v} and {@code w} of
     * the given {@code weight}.
     *
     * @param  v1 one vertex
     * @param  w1 the other vertex
     * @param  weight1 the weight of this edge
     * @throws IllegalArgumentException if either {@code v} or {@code w}
     *         is a negative integer
     * @throws IllegalArgumentException if {@code weight} is {@code NaN}
     */
    public Edge(final int v1, final int w1, final double weight1) {
        if (v1 < 0) {
            throw new IllegalArgumentException(
                "vertex index must be a nonnegative integer");
        }
        if (w1 < 0) {
            throw new IllegalArgumentException(
                "vertex index must be a nonnegative integer");
        }
        if (Double.isNaN(weight1)) {
            throw new IllegalArgumentException("Weight is NaN");
        }
        this.v = v1;
        this.w = w1;
        this.weight = weight1;
    }

    /**
     * Returns the weight of this edge.
     *
     * @return the weight of this edge
     * Time complexity for this method is O(1).
     */
    public double weight() {
        return weight;
    }

    /**
     * Returns either endpoint of this edge.
     *
     * @return either endpoint of this edge
     * Time complexity for this method is O(1).
     */
    public int either() {
        return v;
    }

    /**
     * Returns the endpoint of this edge that is different
     * from the given vertex.
     *
     * @param  vertex one endpoint of this edge
     * @return the other endpoint of this edge
     * @throws IllegalArgumentException if the vertex is not one of the
     *         endpoints of this edge
     * Time complexity for this method is O(1).
     */
    public int other(final int vertex) {
        if (vertex == v) {
            return w;
        } else if (vertex == w) {
            return v;
        } else {
            throw new IllegalArgumentException("Illegal endpoint");
        }
    }
    /**
     * Compares two edges by weight.
     * Note that {@code compareTo()} is not consistent with {@code equals()},
     * which uses the reference equality implementation
     * inherited from {@code Object}.
     *
     * @param  that the other edge
     * @return a negative integer, zero, or positive
     * integer depending on whether
     *         the weight of this is less than, equal to, or greater than the
     *         argument edge
     * Time complexity for this method is O(1).
     */
    @Override
    public int compareTo(final Edge that) {
        return Double.compare(this.weight, that.weight);
    }
}



