package probelms.graphs;

public class Vertex {
	
	private String node;
	public Edge[] adjacencies;
	public double distance=Double.POSITIVE_INFINITY;
	private boolean visited;
	public Vertex previous;
    public String toString() { return node; }
	
	
	public void setVisited() {
		this.visited = true;
	}
	public Vertex(String node) {
		super();
		this.node = node;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public Edge[] getAdjacencies() {
		return adjacencies;
	}
	public void setAdjacencies(Edge[] adjacencies) {
		this.adjacencies = adjacencies;
	}
	

}
