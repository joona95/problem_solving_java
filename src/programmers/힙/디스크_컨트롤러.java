package programmers.힙;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 디스크_컨트롤러 {

    public static int solution(int[][] jobs) {

        Arrays.sort(jobs, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        Queue<Disk> waitingJobs = new LinkedList<>();
        for (int[] job : jobs) {
            waitingJobs.add(new Disk(job[0], job[1]));
        }

        PriorityQueue<Disk> works = new PriorityQueue<>();
        works.add(waitingJobs.poll());
        int time = works.peek().start;
        int totalWorksTime = 0;
        while (!works.isEmpty()) {
            Disk work = works.poll();
            time = time < work.start ? work.start + work.time : time + work.time;
            totalWorksTime += time - work.start;

            while (!waitingJobs.isEmpty() && time >= waitingJobs.peek().start) {
                Disk job = waitingJobs.poll();
                works.add(job);
            }

            if (works.isEmpty() && !waitingJobs.isEmpty()) {
                works.add(waitingJobs.poll());
            }
        }

        return totalWorksTime / jobs.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
        System.out.println(solution(new int[][]{{7, 8}, {3, 5}, {9, 6}}));
        System.out.println(solution(new int[][]{{10, 8}, {3, 5}, {9, 6}}));
    }

    static class Disk implements Comparable {
        int start;
        int time;

        public Disk(int start, int time) {
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Object o) {
            Disk disk = (Disk) o;
            return Integer.compare(time, disk.time);
        }
    }

}
