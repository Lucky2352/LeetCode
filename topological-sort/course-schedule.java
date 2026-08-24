class Solution {
    public static boolean dfs(int node,boolean[] visited,List<List<Integer>> adj) {
		visited[node] = true;
		
		for(int val : adj.get(node)) {
			if(!visited[val]) {
				dfs(val,visited,adj);
				return false;
			}
		}
		return true;
	}
    public boolean canFinish(int n, int[][] matrix) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < matrix.length; i++) {
            adj.get(matrix[i][0]).add(matrix[i][1]);
        }
        boolean visited[] = new boolean[n];
        return dfs(0,visited,adj);
    }
}