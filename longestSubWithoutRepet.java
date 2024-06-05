import java.util.HashSet;

public class longestSubWithoutRepet {

    public static int lengthOfLongestSubstring(String s) {
        int max =0;
        for(int i =0;i<s.length();i++){
            HashSet<Character> hp = new HashSet<>();
            for(int j =i;j<s.length();j++){
                char ch = s.charAt(j);
                if(hp.contains(ch)) break;
                hp.add(ch);
                int len = j-i+1;
                max = Math.max(max,len);

            }
        }
        return max;     
}
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("abcabcab");
        System.out.println(ans);
    }
}
