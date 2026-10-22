# Critical Connections in a Network

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

There are `n` servers numbered from `0` to `n - 1` connected by undirected server-to-server `connections` forming a network where `connections[i] = [ai, bi]` represents a connection between servers `ai` and `bi`. Any server can reach other servers directly or indirectly through the network.

A  *critical connection*  is a connection that, if removed, will make some servers unable to reach some other server.

Return all critical connections in the network in any order.

 

 **Example 1:** 

```
Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
Output: [[1,3]]
Explanation: [[3,1]] is also accepted.

```

 **Example 2:** 

```
Input: n = 2, connections = [[0,1]]
Output: [[0,1]]

```

 

 **Constraints:** 

- 2 <= n <= 105
- n - 1 <= connections.length <= 105
- 0 <= ai, bi <= n - 1
- ai != bi
- There are no repeated connections.

## Solution

**Language:** Java  
**Runtime:** 78 ms (beats 82.85%)  
**Memory:** 254.5 MB (beats 18.10%)  
**Submitted:** 2026-10-22T06:36:38.575Z  

```java
class Solution {
    private int timer = 0;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] disc = new int[n];
        int[] low = new int[n];

        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0, -1, adj, disc, low, bridges);

        return bridges;
    }

    private void dfs(int u, int p, List<List<Integer>> adj, int[] disc, int[] low, List<List<Integer>>  bridges) {
        disc[u] = low[u] = ++timer;

        for (int v : adj.get(u)) {
            if (v == p) {
                continue;
            }

            if (disc[v] == 0) {
                dfs(v, u, adj, disc, low, bridges);

                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/critical-connections-in-a-network/)