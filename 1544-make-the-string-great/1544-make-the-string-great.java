class Solution {
    public String makeGood(String s) {
        boolean removed = true;

        while (removed) {                  
            removed = false;

            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    removed = true;
                    break;                 
                }
            }
        }
        return s;
    }
}