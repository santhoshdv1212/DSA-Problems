class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] isAllowed = new boolean[26];
        
        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }
        
        int consistentCount = 0;
        
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (!isAllowed[c - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}
