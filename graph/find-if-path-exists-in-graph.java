// class Solution {
//     public static boolean find(int src,int des,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> val,boolean[] flag){
//         if(adj,get(src).contains(des))return true;
//         if(flag[src] == true)return false;
//         for(int i )
        
//     }

//     public static ArrayList<ArrayList<Integer>> addEdge(ArrayList<ArrayList<Integer>> ans,int e,int[][] ls){
//         ans = new ArrayList<>();
//         for(int i = 0;i<e;i++){
//             ans.add(new ArrayList<>());
//         }
//         for(int i = 0;i<e;i++){
//             int src = ls[i][0];
//             int des = ls[i][1];
//             ans.get(src).add(des);
//             ans.get(des).add(src);
//         }
//         return ans;
//     }
//     public boolean validPath(int n, int[][] edges, int source, int destination) {
//         ArrayList<ArrayList<Integer>> psb = new ArrayList<>();
//         addEdge(psb,edges.length,edges);

//         for(int i = 0;i<edges.length();i++){
//             int src = edges[i][0];
//             int dest = edges[i][1];
//             if(source == destination)return true;
//             if(src == source && dest == destination)return true;
//         }
//         return false;
//     }
// }
class Solution {

    public boolean dfs(int node, int destination,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {

        if(node == destination) return true;

        visited[node] = true;

        for(int next : adj.get(node)) {
            if(!visited[next]) {
                if(dfs(next, destination, adj, visited))
                    return true;
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges,
                             int source, int destination) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, adj, visited);
    }
}