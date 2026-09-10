class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
     HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
             count.put(nums1[i], count.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(count.getOrDefault(nums2[i],0)>0){
                res.add(nums2[i]);
                count.put(nums2[i], count.get(nums2[i])-1);
            }
        }
        Integer[] arr = res.toArray(new Integer[0]);
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }
}