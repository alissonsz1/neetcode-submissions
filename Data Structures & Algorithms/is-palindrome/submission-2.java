class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        char[] newString = s.toCharArray();
        if (newString.length == 0 || newString.length == 1) {
            return true;
        }
        try {
            int fim = newString.length - 1;
            for (int inicio = 0; inicio <= (newString.length - 1) / 2; inicio++) {
            if (newString[inicio] != newString[fim]) {
                return false;
            }
            fim--;
        }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}