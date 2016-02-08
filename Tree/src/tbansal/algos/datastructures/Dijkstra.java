package tbansal.algos.datastructures;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Vertex implements Comparable<Vertex>
{
    public final String name;
    public Edge[] adjacencies;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    public Vertex(String argName) { name = argName; }
    public String toString() { return name; }
    public int compareTo(Vertex other)
    {
        return Double.compare(minDistance, other.minDistance);
    }

}


class Edge
{
    public final Vertex target;
    public final double weight;
    public Edge(Vertex argTarget, double argWeight)
    { target = argTarget; weight = argWeight; }
}

public class Dijkstra
{
    public static void computePaths(Vertex source)
    {
        source.minDistance = 0.;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
    vertexQueue.add(source);

    while (!vertexQueue.isEmpty()) {
			Vertex u = vertexQueue.poll();

            // Visit each edge exiting u
            for (Edge e : u.adjacencies)
 {
				Vertex v = e.target;
				double weight = e.weight;

				double distanceThroughU = u.minDistance + weight;

				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);

					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
        }
    }

    public static List<Vertex> getShortestPathTo(Vertex target)
    {
        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex = target; vertex != null; vertex = vertex.previous)
            path.add(vertex);

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args)
    {
        // mark all the vertices 
        Vertex one = new Vertex("1");
        Vertex two = new Vertex("2");
        Vertex three = new Vertex("3");
        Vertex four = new Vertex("4");
        Vertex five = new Vertex("5");
        Vertex six = new Vertex("6");
        Vertex seven = new Vertex("7");

        // set the edges and weight
        one.adjacencies = new Edge[]{ new Edge(six, 15) ,new Edge(three, 5)};
        two.adjacencies = new Edge[]{ new Edge(six, 30), new Edge(seven, 45) ,new Edge(four, 20) };
        three.adjacencies = new Edge[]{ new Edge(one, 5),new Edge(five, 25) };
        four.adjacencies = new Edge[]{ new Edge(two, 20) ,new Edge(six, 5) ,new Edge(five, 50) };
        five.adjacencies = new Edge[]{ new Edge(four, 30),new Edge(three, 25) };
        six.adjacencies = new Edge[]{ new Edge(two, 30), new Edge(four, 5), new Edge(three, 10), new Edge(one, 15) };
        seven.adjacencies = new Edge[]{ new Edge(two, 45) ,new Edge(six, 10)  };


        computePaths(one); // run Dijkstra
        System.out.println("Distance to " + two + ": " + two.minDistance);
        List<Vertex> path = getShortestPathTo(two);
        System.out.println("Path: " + path);
    }
}