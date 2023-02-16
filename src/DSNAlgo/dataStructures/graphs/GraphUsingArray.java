package DSNAlgo.dataStructures.graphs;

public class GraphUsingArray {

    private int V; // number of vertices in graph
    private int E; // number of Edges in graph

   private int[][] adgjMatrix;


    public static void main(String[] args) {
        GraphUsingArray g = new GraphUsingArray(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);

    }


    public GraphUsingArray(int nodes){
        this.V  = nodes;
        this.E  = 0;
        this.adgjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v){
        this.adgjMatrix[u][v] = 1;
        this.adgjMatrix[v][u] =1;
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" Vertices, "+E+" Edges"+"\n");
        for(int v=0;v<V; v++){
            sb.append(v+" : ");
            for(int w: adgjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
