package tbansal.probelms.graphs;

public class Edge {
	
	public Edge( Vertex start,int weight) {
		super();
		this.weight = weight;
		this.start = start;
	}
	int weight;
	Vertex start;
	Vertex end;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Vertex getStart() {
		return start;
	}
	public void setStart(Vertex start) {
		this.start = start;
	}
	public Vertex getEnd() {
		return end;
	}
	public void setEnd(Vertex end) {
		this.end = end;
	}
	
	
	

}
