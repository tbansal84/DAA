package probelms.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class GraphTraversal {

	public static void main(String[] args) {
		Vertex one = new Vertex("1");
		Vertex two = new Vertex("2");
		Vertex three = new Vertex("3");
		Vertex four = new Vertex("4");
		Vertex five = new Vertex("5");
		Vertex six = new Vertex("6");
		Vertex seven = new Vertex("7");

		// set the edges and weight
		one.adjacencies = new Edge[] { new Edge(six, 15), new Edge(three, 5) };
		two.adjacencies = new Edge[] { new Edge(six, 30), new Edge(seven, 45),
				new Edge(four, 20) };
		three.adjacencies = new Edge[] { new Edge(one, 5), new Edge(five, 25) };
		four.adjacencies = new Edge[] { new Edge(two, 20), new Edge(six, 5),
				new Edge(five, 50) };
		five.adjacencies = new Edge[] { new Edge(four, 30), new Edge(three, 25) };
		six.adjacencies = new Edge[] { new Edge(two, 30), new Edge(four, 5),
				new Edge(three, 10), new Edge(one, 15) };
		seven.adjacencies = new Edge[] { new Edge(two, 45), new Edge(six, 10) };

		computePaths(one); // run Dijkstra
		 List<Vertex> path = getShortestPathTo(two);
		 System.out.println("Path: " + path);
	}

	private static List<Vertex> getShortestPathTo(Vertex two) {
		Vertex vertex=two;
		List<Vertex> path=new ArrayList<Vertex>();
		while((vertex=vertex.previous)!=null){
			path.add(vertex);
		}
		return path;
	}

	private static void computePaths(Vertex one) {

		one.distance = 0;
		ArrayBlockingQueue<Vertex> queue = new ArrayBlockingQueue<Vertex>(1000);
		queue.add(one);
		Vertex current = null;
		while ((current = queue.poll()) != null) {
			for (Edge e : current.adjacencies) {
				double distance = e.getWeight() + current.distance;
				e.getStart().setVisited();
				if (distance < e.getStart().distance) {
					System.out.println(e.getStart().getNode());
					e.getStart().distance = distance;
					e.getStart().previous=current;
					queue.add(e.getStart());
					
				}
				
			}

		}

	}

}
