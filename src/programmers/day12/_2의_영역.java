package programmers.day12;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _2의_영역 {
    public static int[] solution(int[] arr) {
        int start = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).findFirst().orElse(-1);
        int end = start;
        for (int i=arr.length - 1;i>=start && start!=-1;i--){
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        return start == -1 ? new int[]{-1} : Arrays.copyOfRange(arr, start, end + 1);
    }

    /*
    public List<Integer> solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        return list.contains(2) ? list.subList(list.indexOf(2), list.lastIndexOf(2) + 1) : Arrays.asList(-1);
    }
     */

    public static void main(String[] args) {
        for(int num : solution(new int[]{1,2,1,4,5,2,9}))
            System.out.print(num + " ");
        System.out.println();
        for(int num : solution(new int[]{1,2,1}))
            System.out.print(num + " ");
        System.out.println();
        for(int num : solution(new int[]{1,1,1}))
            System.out.print(num + " ");
        System.out.println();
        for(int num : solution(new int[]{1,2,1,2,1,10,2,1}))
            System.out.print(num + " ");
        System.out.println();
    }
}
