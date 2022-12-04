package Graph.DFS;
import java.util.*;

public class Main {
    static class Edge{
        int src;     // source
        int dest ;  // destination
        int wt;    // weight

        public Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }
    public static void CreateGraph(ArrayList<Edge> [] graph){
        // fill empty to array list.

        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[]  = new ArrayList[V];

        CreateGraph(graph);

        // bfs traversal in graph
        dfs(graph,0,new boolean[V]);  // 0 1 2 3 4 5 6
    }
    public static void dfs(ArrayList<Edge> [] graph , int curr , boolean visited[]){
     System.out.print(curr+" ");
     visited[curr]=true;
     for(int i=0; i<graph[curr].size(); i++){
         Edge e = graph[curr].get(i);
         if(!visited[e.dest]){
             dfs(graph,e.dest,visited);
         }
     }
    }

}

