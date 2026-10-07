class Solution {
    public String truncateSentence(String s, int k) {
        String[] words=s.split(" ");
        String tr="";
        for(int i=0;i<k;i++){
            tr+=words[i]+" ";
        }
        s=tr.trim();
        return s;
    }
}