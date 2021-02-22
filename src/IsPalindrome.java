public class IsPalindrome {
    public static void main(String[] args) {
        Solution_10 s10 = new Solution_10();
        System.out.println(s10.isPalindrome("race a car"));
    }
}

class Solution_10 {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) return true;

        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();

        int i = 0, j = chars.length - 1;
        while (!(i==j || i>j)){
            if(!(Character.isLetter(chars[i]) || Character.isDigit(chars[i]))){
                ++i;
                continue;
            }

            if(!(Character.isLetter(chars[j]) || Character.isDigit(chars[j]))){
                --j;
                continue;
            }

            if(chars[i] == chars[j]){
                ++i;
                --j;
            }else
                return false;
        }

        return true;
    }
}
