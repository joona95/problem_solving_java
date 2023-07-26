package programmers.기초.day7;

public class 수열과_구간_쿼리_4 {
    static public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        for (int num : solution(arr, queries)) {
            System.out.print(num);
        }
    }
}
