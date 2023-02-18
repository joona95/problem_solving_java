package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_10_Tree_말단노드까지의_가장_짧은_경로_BFS {
    static Node root;

    static int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0;i<len;i++){
                Node cur = queue.poll();
                if(cur.lt == null && cur.rt == null) {
                    return level;
                }
                if(cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if(cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
