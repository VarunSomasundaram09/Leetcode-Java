class Solution {
    public int earliestTime(int[][] tasks) {
        int min = tasks[0][0] + tasks[0][1];

        for (int i = 1; i < tasks.length; i++) {
            int finishTime = tasks[i][0] + tasks[i][1];

            min = Math.min(min, finishTime);
        }

        return min;
    }
}