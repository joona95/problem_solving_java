package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {
    public int v1;
    public int v2;
    public int cost;

    public Edge2(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost - o.cost;
    }
}

public class Problem_7_원더랜드_크루스칼 {
    static int[] unf;

    static int find(int v) {
        if(v==unf[v])
            return v;
        else
            return unf[v] = find(unf[v]);
    }

    static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa!=fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n+1];
        ArrayList<Edge2> arr = new ArrayList<>();
        for(int i=1;i<=n;i++)
            unf[i] = i;
        for(int i=0;i<m;i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge2(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge2 o: arr) {
            int fv1 = find(o.v1);
            int fv2 = find(o.v2);
            if(fv1!=fv2){
                answer += o.cost;
                union(o.v1, o.v2);
            }
        }
        System.out.println(answer);
    }
}
