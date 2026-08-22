class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            int land = landStartTime[i] + landDuration[i];
            for (int j = 0; j < waterStartTime.length; j++) {
                int end = Math.max(land, waterStartTime[j]) + waterDuration[j];
                mini = Math.min(mini, end);
            }
        }
        for (int i = 0; i < waterStartTime.length; i++) {
            int water = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < landStartTime.length; j++) {
                int end2 = Math.max(water, landStartTime[j]) + landDuration[j];
                mini = Math.min(mini, end2);
            }
        }
        return mini;
    }
}