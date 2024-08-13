package day2.day4;

public class Merge_Intervals_56 {

    public int[][] merge(int[][] intervals) {
        int[][] result = new int[intervals.length - 1][2];
        int t1 = 0;
        int t2 = 0;
        int counter = 0;
        System.out.println(intervals.length);
        for (int i = 0; i < intervals.length - 1; i++) {// rows

            System.out.println(intervals[i][intervals[i].length - 1]);
            System.out.println(intervals[i + 1][0]);
            if (intervals[i][intervals[i].length - 1] >= intervals[i + 1][0]) {
                System.out.println("first " + intervals[i][0] + "," + intervals[i + 1][intervals[i].length - 1]);
                t1 = intervals[i][0];
                t2 = intervals[i + 1][intervals[i].length - 1];
                if (intervals[i][0] > intervals[i + 1][0]) {
                    System.out
                            .println(
                                    "first 2 " + intervals[i + 1][0] + "," + intervals[i + 1][intervals[i].length - 1]);
                    if (intervals[i][intervals[i].length - 1] > intervals[i + 1][intervals[i].length - 1]) {
                        System.out
                                .println(
                                        "first 3 " + intervals[i + 1][0] + "," + intervals[i][intervals[i].length - 1]);
                        t1 = intervals[i + 1][0];
                        t2 = intervals[i][intervals[i].length - 1];
                        result[i][0] = t1;
                        result[i][result[i].length - 1] = t2;
                        counter++;
                    } else {
                        System.out.println("sout 3");
                        t1 = intervals[i + 1][0];
                        t2 = intervals[i + 1][intervals[i].length - 1];
                        result[i][0] = t1;
                        result[i][result[i].length - 1] = t2;
                        counter++;
                    }

                } else {
                    if (intervals[i + 1][intervals[i].length - 1] < intervals[i][intervals[i].length - 1]) {
                        t1 = intervals[i + 1][0];
                        t2 = intervals[i + 1][intervals[i].length - 1];
                        System.out.println("sout 4");
                        result[i][0] = t1;
                        result[i][result[i].length - 1] = t2;
                        counter++;
                    } else {
                        // int [][] r1={{t1,t2}};
                        System.out.println("sout 5");
                        result[i][0] = t1;
                        result[i][result[i].length - 1] = t2;
                        counter++;
                    }

                }

            } else {
                System.out.println("sec " + intervals[i + 1][0] + "," + intervals[i + 1][intervals[i].length - 1]);
                t1 = intervals[i + 1][0];
                t2 = intervals[i + 1][intervals[i].length - 1];
                result[i][0] = t1;
                result[i][result[i].length - 1] = t2;
                // counter++;
            }

        }
        if (counter == 0) {
            return intervals;
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ",");
            }
        }
        System.out.println();
        return result;
    }

    public static void main(String[] args) {
        // int a []= {1,3};
        // int testCase []={a,};
        Merge_Intervals_56 merge_Intervals_56 = new Merge_Intervals_56();
        // int[][] testCase = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] testCase = { { 1, 4 }, { 5, 6 } };
        int[][] testCase = { { 1, 4 }, { 2, 3 } };
        merge_Intervals_56.merge(testCase);

    }

}
