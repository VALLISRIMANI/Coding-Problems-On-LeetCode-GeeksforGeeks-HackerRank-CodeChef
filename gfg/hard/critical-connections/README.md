# Critical Connections in Graph

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A critical connection refers to an edge that, upon removal, will make it impossible for certain nodes to reach each other through any path. Given an undirected connected graph with  **v** vertices and  **edges[][]**  where each vertex is distinct and ranges from 0 to v-1, and you have to find all critical connections in the graph. It is ensured that there is at least one such edge present.

 **Note:**  Return the connections in sorted order.

 **Examples:** 

```
Input:

Output: 
0 1
0 2
Explanation: On removing edge (0, 1), you will not be able to reach node 0 and 2 from node 1. Also, on removing edge (0, 2), you will not be able to reach node 0
and 1 from node 2.
```

```
Input:

Output: 2 3
Explanation: The edge between nodes 2 and 3 is the only Critical connection in the given graph.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T06:50:42.316Z  

```java
class Solution {

    private int timer = 0;

    public ArrayList<ArrayList<Integer>> criticalConnections(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        int[] disc = new int[V];
        int[] low = new int[V];

        ArrayList<ArrayList<Integer>> bridges = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (disc[i] == 0) {
                dfs(i, -1, adj, disc, low, bridges);
            }
        }
        
        Collections.sort(bridges, (a, b) -> {
            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            }
            return a.get(1) - b.get(1);
        });

        return bridges;
    }

    private void dfs(
        int u,
        int parent,
        ArrayList<ArrayList<Integer>> adj,
        int[] disc,
        int[] low,
        ArrayList<ArrayList<Integer>> bridges) {

        disc[u] = low[u] = ++timer;

        for (int v : adj.get(u)) {

            if (v == parent) {
                continue;
            }

            if (disc[v] == 0) {

                dfs(v, u, adj, disc, low, bridges);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u]) {
                    ArrayList<Integer> bridge = new ArrayList<>();

                    bridge.add(Math.min(u, v));
                    bridge.add(Math.max(u, v));

                    bridges.add(bridge);
                }

            } else {

                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/critical-connections/1)