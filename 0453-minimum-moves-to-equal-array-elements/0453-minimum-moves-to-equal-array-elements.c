int minMoves(int* nums, int numsSize) {
    int min = nums[0];
    int count= 0;
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] < min) {
            min = nums[i];
        }
    }

    for (int i = 0; i < numsSize; i++) {
        count+= nums[i] - min;
    }

    return count;
}