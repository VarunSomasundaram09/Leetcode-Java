class Solution {
public int missingNumber(int[] nums) {
    HashSet Set = new HashSet<>();
        int missingNum = 0;
        for( int itr : nums){
             Set.add(itr);
        }
        for(int i=0; i<nums.length+1; i++){
             if(!Set.contains(i))
                    missingNum = i;
        }
    return missingNum;
    }
}