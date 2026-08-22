class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj , int a , boolean vis[]){
        if(vis[a]) return;
        vis[a] = true;
        for(int b:adj.get(a)){
            dfs(adj,b,vis);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj;
        adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i = 0 ; i<isConnected.length ;i++){
            for(int j = 0;j<isConnected[0].length;j++){
                if(isConnected[i][j] == 1 && i != j){
            int src = i;
            int dest =j;
            adj.get(src).add(dest);
            adj.get(dest).add(src);
                }
            
            }
            
        }
        int count = 0;
        boolean[] vis = new boolean[isConnected.length];
        for(int i = 0 ; i<isConnected.length ; i++){
            if(vis[i]) continue;
            dfs(adj,i,vis);
            count++;
        }
        return count;
    }
    }