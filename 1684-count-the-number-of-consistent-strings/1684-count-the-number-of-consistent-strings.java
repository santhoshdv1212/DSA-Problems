class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int allowedCH[] = new int[26];
        for(int i = 0 ; i < allowed.length() ; i++) {
            allowedCH[allowed.charAt(i) - 'a']++;
        }
        int count = 0;
        for(int i = 0 ; i < words.length ; i++) {
            if(consistent(allowedCH , words[i])) {
                count++;
            }
        }
        return count;
    }

    public boolean consistent(int allowedCH[] , String st2) {
        for(int i = 0 ; i < st2.length() ; i++) {
            if(allowedCH[st2.charAt(i) - 'a'] == 0) {
                return false;
            }
        }
        return true;
    }
}