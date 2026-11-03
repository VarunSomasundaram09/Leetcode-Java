int minMoves(int* nums, int numsSize) {
    int count = 0;
    int max = nums[0];
    for(int i = 1; i < numsSize; i++) {
        if(nums[i] > max) {
            max = nums[i];
        }
    }
    for(int i = 0; i < numsSize; i++) {
        count += max - nums[i];
    }

    return count;
}