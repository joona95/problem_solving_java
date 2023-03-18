package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2> {

    public int time;
    public char state;

    public Time2(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time2 o) {
        if (this.time == o.time)
            return this.state - o.state;
        else
            return this.time - o.time;
    }
}

public class Problem_3_결혼식 {
    static int solution(ArrayList<Time2> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Time2 o : arr) {
            if (o.state == 's')
                cnt++;
            else
                cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();
            arr.add(new Time2(s, 's'));
            arr.add(new Time2(e, 'e'));
        }
        System.out.println(solution(arr));
    }
}
