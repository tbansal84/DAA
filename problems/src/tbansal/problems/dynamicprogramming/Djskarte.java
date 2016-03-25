package tbansal.problems.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class Djskarte {

	public static void main(String[] args) {

	}

}

class Node {

	private String value;

	private List<Edge> edges = new ArrayList<Edge>();

	public String getValue() {
		return value;
	}

	public void setValue(String value, List<Edge> edges) {
		this.value = value;
		this.edges=edges;
	}

	public Node(String value) {
		super();
		this.value = value;
	}

}

class Edge {

	private int weight;

	public Edge(int weight) {
		super();
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
