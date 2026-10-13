
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] res = new int[nums.length];

        for (int k = 0; k < n; k += 1) {
            res[2 * k] = nums[i++];
            res[2 * k + 1] = nums[j++];
        }

        return res;
    }
}
