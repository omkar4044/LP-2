public class AStarSimple {

    public static void main(String[] args) {

        int graph[][] = {
                {0, 1, 4, 0},
                {1, 0, 2, 5},
                {4, 2, 0, 1},
                {0, 5, 1, 0}
        };

        // Heuristic values
        int h[] = {7, 4, 2, 0};

        int start = 0;
        int goal = 3;

        boolean visited[] = new boolean[4];

        int current = start;

        System.out.println("Path:");

        while (true) {

            visited[current] = true;

            System.out.print(current + " ");

            // Goal reached
            if (current == goal) {

                System.out.println("\nGoal Reached");
                break;
            }

            int next = -1;
            int min = 999;

            // Find node with minimum heuristic
            for (int i = 0; i < 4; i++) {

                if (graph[current][i] != 0 &&
                        !visited[i] &&
                        h[i] < min) {

                    min = h[i];
                    next = i;
                }
            }

            // No path found
            if (next == -1) {

                System.out.println("\nNo Path");
                break;
            }

            current = next;
        }
    }
}


// # Main Concept of A* Algorithm

// A* (A-Star) is a **path finding/search algorithm**.

// It finds the **best path** from:

// * Start node → Goal node

// It uses:

// ```text id="mt7kik"
// f(n) = g(n) + h(n)
// ```

// f(n)=g(n)+h(n)

// Where:

// | Term   | Meaning                            |
// | ------ | ---------------------------------- |
// | `g(n)` | Actual cost from start             |
// | `h(n)` | Heuristic (estimated cost to goal) |
// | `f(n)` | Total cost                         |

// In your simplified code, only `h(n)` is used for priority.

// ---

// # Main Points of Code

// ---

// # 1. Import Package

// ```java id="l1h26w"
// import java.util.*;
// ```

// Used for:

// * `PriorityQueue`

// ---

// # 2. Graph Representation

// ```java id="8e8lmv"
// int graph[][]
// ```

// Graph stored as **Adjacency Matrix**.

// Example:

// ```text id="m8c18r"
// 0 → 1(cost=1), 2(cost=4)
// 1 → 0(cost=1), 2(cost=2), 3(cost=5)
// ```

// ---

// # 3. Heuristic Array

// ```java id="m0thk5"
// int h[] = {7,4,2,0};
// ```

// Estimated distance to goal.

// | Node | Heuristic |
// | ---- | --------- |
// | 0    | 7         |
// | 1    | 4         |
// | 2    | 2         |
// | 3    | 0         |

// Goal node heuristic is `0`.

// ---

// # 4. Start and Goal

// ```java id="6pbvr4"
// int start = 0;
// int goal = 3;
// ```

// Search starts at node `0` and ends at node `3`.

// ---

// # 5. Visited Array

// ```java id="m4wfkh"
// boolean visited[]
// ```

// Prevents revisiting nodes.

// ---

// # 6. Priority Queue

// ```java id="0rn3ww"
// PriorityQueue<Integer> pq
// ```

// Stores nodes based on smallest heuristic value.

// Smallest `h(n)` gets highest priority.

// ---

// # 7. Add Start Node

// ```java id="flrhz1"
// pq.add(start);
// ```

// Adds starting node to queue.

// ---

// # 8. Main Loop

// ```java id="5jlwmz"
// while (!pq.isEmpty())
// ```

// Runs until queue becomes empty.

// ---

// # 9. Remove Best Node

// ```java id="s8d7f5"
// int current = pq.poll();
// ```

// Removes node with smallest heuristic.

// ---

// # 10. Goal Check

// ```java id="c9ysmq"
// if(current == goal)
// ```

// Stops when goal node is found.

// ---

// # 11. Visit Neighbors

// ```java id="sgf9x1"
// if(graph[current][i] != 0 && !visited[i])
// ```

// Checks connected unvisited nodes.

// ---

// # 12. Add Neighbor to Queue

// ```java id="v0b8hz"
// pq.add(i);
// ```

// Adds neighbor for future exploration.

// ---

// # Output Traversal

// ```text id="eh7tcn"
// Path:
// 0 2 3

// Goal Reached
// ```

// Because:

// * Node `2` has lower heuristic than `1`
// * Then reaches goal `3`

// ---

// # Difference Between BFS and A*

// | BFS                    | A*                       |
// | ---------------------- | ------------------------ |
// | No heuristic           | Uses heuristic           |
// | Explores level-wise    | Explores best path first |
// | Slower in large graphs | Faster and smarter       |

// ---

// # Time Complexity

// Worst case:

// ```text id="c3q48h"
// O(E log V)
// ```

// Where:

// * `V` = Vertices
// * `E` = Edges
