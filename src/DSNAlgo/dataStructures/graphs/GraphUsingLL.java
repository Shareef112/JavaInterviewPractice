package DSNAlgo.dataStructures.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphUsingLL {

    LinkedList<Integer>[] adjMatrix;
    private int V;
    private int E;

    public static void main(String[] args) {
        GraphUsingLL g = new GraphUsingLL(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
        g.breathFirstSearch(0);
        System.out.println();
        g.depthFirstSearch(0);
        System.out.println();
        g.recursiveDepthFirstSearch(0);
        System.out.println();
        System.out.println(g.connectedComponentsInGraph());


    }

    public GraphUsingLL(int nodes){
        adjMatrix = new LinkedList[nodes];
        this.E =0;
        this.V = nodes;
        for(int i=0;i<nodes;i++){
            this.adjMatrix[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        this.adjMatrix[u].add(v);
        this.adjMatrix[v].add(u);
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" Vertices, "+E+" Edges"+"\n");
        for(int v=0;v<V; v++){
            sb.append(v+" : ");
            for(int w: adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public void breathFirstSearch(int s){

        boolean[] isVisited =  new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        isVisited[s] = true;
        q.offer(s);
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.println(u+" ");
            for(int v: adjMatrix[u]){
                if(!isVisited[v]){
                    isVisited[v] = true;
                    q.offer(v);
                }
            }
        }

    }

    public void depthFirstSearch(int s){

        boolean[] isVisited =  new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()){
            int u = stack.pop();
           if(!isVisited[u]){
               isVisited[u] = true;
               System.out.println(u+" ");
               for(int v : adjMatrix[u]){
                   if(!isVisited[v]){
                       stack.push(v);
                   }
               }
           }
        }

    }
    public void recursiveDepthFirstSearch(int s){

        boolean[] isVisited =  new boolean[V];

        for(int v =0; v<V;v++){
            if(!isVisited[v]){
                dfs(v,isVisited);
            }

        }

    }

    public void dfs(int v,boolean[] visited){
        visited[v] = true;
        System.out.println(v+" ");
        for(int w: adjMatrix[v]){
                if(!visited[w]){
                    dfs(w,visited);
                }
        }
    }

    public int connectedComponentsInGraph(){
        boolean[] visited = new boolean[V];
        int[] compId = new int[V];
        int count = 0;
        for(int v=0;v<V;v++){
            if(!visited[v]){
                ccDfs(v,visited,compId,count);
                count++;
            }
        }
        return count;
    }

    public void  ccDfs(int v, boolean[] visited, int[] compID,int count){
        visited[v] = true;
        compID[v] = count;
        for(int w : adjMatrix[v]){
            if(!visited[w]){
                ccDfs(w,visited,compID,count);
            }
        }
    }
}
