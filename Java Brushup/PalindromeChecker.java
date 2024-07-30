public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama"; 
        boolean result = isPalindrome(input);
        System.out.println("\"" + input + "\" is a palindrome: " + result);
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; 
        }
        
        String cleanedStr = cleanString(str);
        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static String cleanString(String str) {
       
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
