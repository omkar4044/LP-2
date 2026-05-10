import java.util.*;

public class Graph {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited = new boolean[5];

    // DFS
    static void DFS(int v) {

        visited[v] = true;
        System.out.print(v + " ");

        for (int i = 0; i < graph.get(v).size(); i++) {

            int node = graph.get(v).get(i);

            if (visited[node] == false) {

                DFS(node);
            }
        }
    }

    // BFS
    static void BFS(int start) {

        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[5];

        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {

            int v = q.poll();
            System.out.print(v + " ");

            for (int i = 0; i < graph.get(v).size(); i++) {

                int node = graph.get(v).get(i);

                if (vis[node] == false) {

                    vis[node] = true;
                    q.add(node);
                }
            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        // Edges
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        System.out.print("DFS: ");
        DFS(0);

        System.out.print("\nBFS: ");
        BFS(0);
    }
}








// ## Concept of DFS and BFS

// Graphs are data structures made of:

// * **Vertices (Nodes)** → points like `0,1,2,3,4`
// * **Edges** → connections between nodes

// Your graph looks like this:

// ```text
//     0
//    / \
//   1   2
//   |   |
//   3   4
// ```

// This is an **Undirected Graph**, because connections work both ways.

// Example:

// ```java
// graph.get(0).add(1);
// graph.get(1).add(0);
// ```

// means:

// ```text
// 0 ↔ 1
// ```

// ---

// # 1. DFS (Depth First Search)

// DFS visits nodes by going **deep first**.

// ### Working

// Starting from node `0`:

// ```text
// 0 → 1 → 3
// ```

// After reaching the end, it backtracks:

// ```text
// 0 → 2 → 4
// ```

// ### DFS Traversal Output

// ```text
// 0 1 3 2 4
// ```

// ### Uses of DFS

// * Path finding
// * Cycle detection
// * Topological sorting
// * Maze solving

// ---

// # 2. BFS (Breadth First Search)

// BFS visits nodes **level by level**.

// It uses a **Queue**.

// ### Working

// Starting from node `0`:

// ```text
// Level 1 : 0
// Level 2 : 1 2
// Level 3 : 3 4
// ```

// ### BFS Traversal Output

// ```text
// 0 1 2 3 4
// ```

// ### Uses of BFS

// * Shortest path in unweighted graph
// * Network broadcasting
// * Web crawling
// * Social networking suggestions

// ---

// # Main Points of the Code

// ## 1. Import Package

// ```java
// import java.util.*;
// ```

// Used for:

// * `ArrayList`
// * `Queue`
// * `LinkedList`

// ---

// # 2. Graph Representation

// ```java
// ArrayList<ArrayList<Integer>> graph
// ```

// Graph is stored using **Adjacency List**.

// Example:

// ```text
// 0 → 1,2
// 1 → 0,3
// 2 → 0,4
// ```

// ---

// # 3. DFS Function

// ```java
// static void DFS(...)
// ```

// * Uses **Recursion**
// * Visits node deeply first
// * Marks node as visited

// Main steps:

// ```java
// visited[v] = true;
// System.out.print(v);
// DFS(nextNode);
// ```

// Output:

// ```text
// 0 1 3 2 4
// ```

// ---

// # 4. BFS Function

// ```java
// static void BFS(...)
// ```

// * Uses **Queue**
// * Visits nodes level by level

// Main steps:

// ```java
// q.add(start);
// q.poll();
// q.add(neighbour);
// ```

// Output:

// ```text
// 0 1 2 3 4
// ```

// ---

// # 5. Visited Array

// ```java
// boolean visited[]
// ```

// Prevents revisiting nodes.

// ---

// # 6. Main Function

// Creates graph and calls:

// ```java
// DFS(0, graph, visited);
// BFS(0, graph, vertices);
// ```

// Starts traversal from node `0`.

// ---

// # Concept Summary

// | DFS                    | BFS                    |
// | ---------------------- | ---------------------- |
// | Deep traversal         | Level traversal        |
// | Uses Recursion/Stack   | Uses Queue             |
// | Faster for deep search | Best for shortest path |

