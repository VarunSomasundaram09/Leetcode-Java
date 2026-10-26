class Solution {
    public String removeDuplicates(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (result.length() > 0 &&
                    result.charAt(result.length() - 1) == c) {
                result = result.substring(0, result.length() - 1);
            } else {
                result = result + c;
            }
        }

        return result;
    }
}