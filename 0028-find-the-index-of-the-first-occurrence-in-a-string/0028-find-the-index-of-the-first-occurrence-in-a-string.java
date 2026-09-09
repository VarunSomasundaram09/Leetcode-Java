class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int ind=haystack.indexOf(needle);
            return ind;
        }
        return -1;
    }
}