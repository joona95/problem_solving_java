package programmers.day6;

public class 수열과_구간_쿼리_3 {
    static public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int[] query : queries) {
            int tmp = answer[query[0]];
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        for (int num : solution(arr, queries)) {
            System.out.print(num);
        }
    }
}
