import java.util.*;

public class Demo {

    static List<List<Integer>> adj;
   // static boolean[] visited = new boolean[100005];
    static int[] inDegree_list ;

    public static void main(String[] args) {

        int n = 8 ;
        int[][] edges = {{0,4},{0,1},{1,2},{2,3},{3,4},{4,0},{5,6},{6,7}};


        adj = new ArrayList<>();
        for(int i = 0 ; i < n ; ++i){
            adj.add(new ArrayList<>());
        }

        inDegree_list = new int[n];
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            inDegree_list[edge[1]]++;
        }

        List<Integer> result = buildOrder(n);

        if(result == null) throw new NullPointerException();

        for(int i : result){
            System.out.print(i+" ");
        }
    }

    public static List<Integer> buildOrder(int n){

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < inDegree_list.length; ++i){
            if(inDegree_list[i] == 0)
                q.offer(i);
        }

        List<Integer> result = new ArrayList<>();

        while(!q.isEmpty()){
            int top = q.poll();
            result.add(top);

            for(int v : adj.get(top)){
                --inDegree_list[v];

                if(inDegree_list[v] == 0)
                    q.offer(v);
            }
        }

        if(q.isEmpty() && result.size() != n)
              return null;

        return result;
    }
}
