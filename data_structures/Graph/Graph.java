public class Graph{
	private final int MAX_VERTS = 1000;
	private Vertex vertexList[];
	//private int adjMat[][];
	private int nVerts;

	public Graph(){
		vertexList = new Vertex[MAX_VERTS];
		adjMat[MAX_VERTS][MAX_VERTS];

		nVerts = 0;

	}
}