import java.util.*;

public class Demo {

    static List<List<Integer>> adj = new ArrayList<>();
    static boolean[] visited = new boolean[100005];

    public static void main(String[] args) {

        int n = 7 ;
        int[][] edges = {{0,1},{0,3},{2,1},{2,3},{3,4},{4,5},{5,6}};

        for(int i = 0 ; i < n ; ++i){
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }

        System.out.println(isThereAPath(0,3));
    }

    public static boolean isThereAPath(int nodeA, int nodeB){

        visited[nodeA] = true;

        if (nodeA == nodeB) return true;

        for(int v : adj.get(nodeA)){
            if(!visited[v]) {
                if (isThereAPath(v, nodeB)) return true;
            }
        }
        return false;
    }
}
