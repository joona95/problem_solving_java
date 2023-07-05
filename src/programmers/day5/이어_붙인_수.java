package programmers.day5;

public class 이어_붙인_수 {
    static public int solution(int[] num_list) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (int num : num_list) {
            if (num % 2 ==0) {
                result1.append(num);
            }
            else {
                result2.append(num);
            }
        }
        return Integer.parseInt(result1.toString()) + Integer.parseInt(result2.toString());
    }

    public static void main(String[] args) {
        int[] num_list1 = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list1));
        int[] num_list2 = {5, 7, 8, 3};
        System.out.println(solution(num_list2));
    }
}
