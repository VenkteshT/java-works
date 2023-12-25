package dsa.graph;

import java.util.*;

public class Graph {
    public static class Edge {
        int dest;
        int src;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], boolean vis[], int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (!vis[cur]) {
                vis[cur] = true;
                System.out.println(cur);
                for (int i = 0; i < graph[cur].size(); i++) {
                    Edge e = graph[cur].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int cur) {

        System.out.println(cur);
        vis[cur] = true;
        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!vis[e.dest]) {
                dfs(graph, vis, e.dest);
            }
        }

    }

    public static void main(String arg[]) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        creatGraph(graph);
        boolean vis[] = new boolean[V];
        dfs(graph, vis, 0);
    }
}