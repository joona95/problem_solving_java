package programmers.기초.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열_만들기_2 {
    static public int[] solution(int l, int r) {
        List<Integer> arr = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (i % 5 == 0) {
                boolean flag = false;
                for (char c : String.valueOf(i).toCharArray()) {
                    if (c != '5' && c != '0') {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    arr.add(i);
                }
            }
        }

        /*
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }
         */

        return arr.isEmpty() ? new int[] { -1 } : arr.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        for (int i : solution(l, r))
            System.out.println(i);
    }
}
