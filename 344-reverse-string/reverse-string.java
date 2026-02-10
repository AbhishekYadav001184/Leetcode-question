class Solution {
    public void reverseString(char[] s) {
        mmmm(s, 0, s.length - 1);
    }

    private void mmmm(char[] s, int left, int right) {
        if (left >= right) return;   
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        mmmm(s, left + 1, right - 1); 
    }
}
