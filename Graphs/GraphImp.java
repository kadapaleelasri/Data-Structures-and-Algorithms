import java.util.*;
public class GraphImp {
    static class Edge {
        int src;
        int dest;
        public Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int src,boolean[] vis){
        int curr = src;
        System.out.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e1 = graph[curr].get(i);
            if(!vis[e1.dest]){
                dfs(graph,e1.dest, vis);
            }
        }
    }
    public static void bfs(ArrayList<Edge>[] graph,int src,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
            }
            for(int i=0;i<graph[curr].size();i++){
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]){
                    q.add(e.dest);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 4; 
        //array of array int arr[] = new arr[n]
        //array of arraylist
        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        //vertex - 0
        graph[0].add(new Edge(0, 1));

        //vertex - 1
        graph[1].add(new Edge(1,2 ));
        graph[1].add(new Edge(1,0 ));
        
        //vertex - 2
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        //vertex - 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        
        //dfs(graph,0,new boolean[V]);
        bfs(graph, 2,new boolean[V]);
    }
}
