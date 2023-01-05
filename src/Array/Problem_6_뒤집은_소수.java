package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_6_뒤집은_소수 {
    /*
    static ArrayList<Integer> solution(String[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] ch = new int[100001];
        for (int i = 2; i < 100001; i++) {
            for (int j = i * 2; j < 100001; j = j + i) {
                ch[j] = 1;
            }
        }
        for (String str : arr) {
            String tmp = new StringBuilder(str).reverse().toString();
            int num = Integer.parseInt(tmp);
            if (num > 1 && ch[num] == 0) {
                answer.add(num);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        for (int x : solution(arr)) {
            System.out.print(x + " ");
        }
    }
     */

    static public boolean isPrime(int num) {
        if (num == 1)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res))
                answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
