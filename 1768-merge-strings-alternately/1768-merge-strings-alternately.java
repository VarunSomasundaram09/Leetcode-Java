class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        char[] arr = new char[n];

        int k = 0;

        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            arr[k++] = word1.charAt(i);
            arr[k++] = word2.charAt(i);
        }

        for (int i = Math.min(word1.length(), word2.length()); i < word1.length(); i++) {
            arr[k++] = word1.charAt(i);
        }

        for (int i = Math.min(word1.length(), word2.length()); i < word2.length(); i++) {
            arr[k++] = word2.charAt(i);
        }

        return new String(arr);
    }
}