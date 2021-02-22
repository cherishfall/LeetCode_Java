public class ReverseVowels {
    public static void main(String[] args) {
        Solution_11 s11 = new Solution_11();
        System.out.println(s11.reverseVowels("hello"));

        String ss = "lifan";
        System.out.println(ss);
    }
}


class Solution_11 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        char tmp;
        int i = 0, j = chars.length - 1;
        while (!(i == j || i > j)){
            if(isVowel(chars[i])){
                if(isVowel(chars[j])){
                    tmp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = tmp;
                    ++i;
                    --j;
                }else {
                    --j;
                    continue;
                }

            }else {
                ++i;
                continue;
            }
        }

        return String.copyValueOf(chars);
    }

    boolean isVowel(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
