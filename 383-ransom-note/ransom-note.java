class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> seenNote = new HashMap<>();
        Map<Character, Integer> seenMag = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            seenNote.put(c, seenNote.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            seenMag.put(c, seenMag.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (seenMag.get(c) == null || seenMag.get(c) < seenNote.get(c)) {
                return false;
            }
        }

        return true;

    }
}

// Time and space are both O(ransomNote.length() + magazine.length()) -> O(m + n)