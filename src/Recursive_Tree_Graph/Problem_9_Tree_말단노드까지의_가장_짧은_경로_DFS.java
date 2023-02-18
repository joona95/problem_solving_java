package Recursive_Tree_Graph;

public class Problem_9_Tree_말단노드까지의_가장_짧은_경로_DFS {
    static Node root;

    static int DFS(int level, Node root) {
        if(root.lt==null && root.rt==null)
            return level;
        else
            return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0, root));
    }
}
