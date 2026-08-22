class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> freq = new HashMap<>();
        HashMap<String, Character> count = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (freq.containsKey(ch)) {
                if (!freq.get(ch).equals(arr[i]))
                    return false;
            } else {
                freq.put(ch, arr[i]);
            }
            if (count.containsKey(arr[i])) {
                if (count.get(arr[i]) != ch)
                    return false;
            } else {
                count.put(arr[i], ch);
            }
        }
        return true;
    }
}