package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s, h, w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

public class Problem_4_가장_높은_탑_쌓기 {
    static int dy[];

    static int solution(ArrayList<Brick> arr) {
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        int answer = dy[0];
        for (int i = 1; i < arr.size(); i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).w < arr.get(j).w && max < dy[j]) {
                    max = dy[j];
                }
            }
            dy[i] = max + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        dy = new int[n];
        ArrayList<Brick> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Brick(s, h, w));
        }
        System.out.println(solution(arr));
    }
}
