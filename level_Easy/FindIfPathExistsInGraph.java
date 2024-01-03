package level_Easy;

import java.util.ArrayList;

public class FindIfPathExistsInGraph {
	public boolean validPath(int n, int[][] edges, int source, int destination) {
		ArrayList<Integer>[] graph = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			graph[i] = new ArrayList<>();

		}
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			graph[u].add(v);
			graph[v].add(u);
		}

		return hashpath(graph, source, destination, new boolean[n]);

	}

	boolean hashpath(ArrayList<Integer>[] graph, int src, int dest, boolean[] vis) {
		if (src == dest) {
			return true;

		}
		vis[src] = true;
		for (int i = 0; i < graph[src].size(); i++) {
			int e = graph[src].get(i);
			if (!vis[e] && hashpath(graph, e, dest, vis)) {
				return true;
			}
		}
		return false;
	}
}
