package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_7_이진트리_레벨탐색 {
    static Node root;

    static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(level+ " : ");
            for(int i=0;i<len;i++) {
                Node cur = queue.poll();
                System.out.print(cur.data+" ");
                if(cur.lt != null)
                    queue.offer(cur.lt);
                if(cur.rt != null)
                    queue.offer(cur.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root);
    }
}
