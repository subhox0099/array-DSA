class Solution {
    public int lengthOfLastWord(String s) {
        String[] result  = s.trim().split("\\s+");
        String lastindex = result[result.length-1];
        return lastindex.length();
    }
}
