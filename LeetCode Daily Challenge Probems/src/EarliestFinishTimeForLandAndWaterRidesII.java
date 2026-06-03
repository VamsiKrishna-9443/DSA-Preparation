public class EarliestFinishTimeForLandAndWaterRidesII {

    public static int finishTime(int[] start1, int[] duration1,
                                 int[] start2, int[] duration2) {

        int finish1 = Integer.MAX_VALUE;

        for (int i = 0; i < start1.length; i++) {
            finish1 = Math.min(finish1, start1[i] + duration1[i]);
        }

        int finish2 = Integer.MAX_VALUE;

        for (int j = 0; j < start2.length; j++) {
            finish2 = Math.min(
                    finish2,
                    Math.max(finish1, start2[j]) + duration2[j]
            );
        }

        return finish2;
    }

    public static int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                         int[] waterStartTime, int[] waterDuration) {

        int result1 = finishTime(
                landStartTime, landDuration,
                waterStartTime, waterDuration
        );

        int result2 = finishTime(
                waterStartTime, waterDuration,
                landStartTime, landDuration
        );

        return Math.min(result1, result2);
    }

    public static void main(String[] args) {

        int[] landStartTime = {2, 8};
        int[] landDuration = {4, 1};

        int[] waterStartTime = {6};
        int[] waterDuration = {3};

        int result = earliestFinishTime(
                landStartTime,
                landDuration,
                waterStartTime,
                waterDuration
        );

        System.out.println("Earliest Finish Time = " + result);
    }
}