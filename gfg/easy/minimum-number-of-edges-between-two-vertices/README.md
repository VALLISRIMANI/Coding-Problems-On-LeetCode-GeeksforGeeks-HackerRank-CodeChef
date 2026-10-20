# Minimum Edges Between Two Vertices

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an undirected graph with  **V** vertices numbered from  **0**  to  **V-1**  and **E**  edges, represented as a 2D array  **edges[][]**, where each element edges[i] = [a, b] represents an undirected edge between vertex a and vertex b.

You are also given two vertices u and v. Your task is to find the minimum number of edges in the path between these two vertices.

If there is no path between u and v, return  **-1**.

 **Examples:** 

```
Input: V = 6, E = 6, edges[][] = [[0, 1], [1, 2], [2, 3], [3, 4], [4, 5], [3, 5]], u = 2, v = 5

Output: 2
Explanation: The path between vertex 2 and vertex 5: 2 -> 3 -> 5, has 2 edges.

```

```
Input: V = 6, E = 4, edges[][] = [[1, 2], [2, 0], [0, 3], [4, 5]], u = 1, v = 5

Output: -1
Explanation: There is no path between the two vertices.
```

**Constraints:
**1 ≤ V ≤ 103
1 ≤ E ≤  V*(V-1)/2
0 ≤ edges[i][0], edges[i][1] < V
0 ≤ u, v < V

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T09:24:35.155Z  

```java
class Solution {
    public int minEdges(int V, int[][] edges, int u, int v) {
        // code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        int[] dist = new int[V];

        q.offer(u);
        visited[u] = true;

        while (!q.isEmpty()) {
            int curr = q.poll();

            if (curr == v) {
                return dist[curr];
            }

            for (int neigh : graph.get(curr)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    dist[neigh] = dist[curr] + 1;
                    q.offer(neigh);
                }
            }
        }

        return -1;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/minimum-number-of-edges-between-two-vertices/1)