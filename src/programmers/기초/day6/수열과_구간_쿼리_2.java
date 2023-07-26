package programmers.기초.day6;

public class 수열과_구간_쿼리_2 {
    static public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (queries[i][2] < arr[j] && arr[j] < min) {
                    min = arr[j];
                }
            }
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;

        /*
        return IntStream.range(0, queries.length)
                .map(q -> IntStream.rangeClosed(queries[q][0], queries[q][1])
                        .map(i -> arr[i])
                        .filter(i -> i > queries[q][2])
                        .min().orElse(-1)
                ).toArray();
         */
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
        for (int num : solution(arr, queries)) {
            System.out.print(num);
        }
    }
}
