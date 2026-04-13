class Solution {
    public String reverseWords(String s) {
        // Step 1: trim spaces
        s = s.trim();

        // Step 2: split by multiple spaces
        String[] words = s.split("\\s+");

        // Step 3: reverse using two pointers
        int left = 0, right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Step 4: join words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}