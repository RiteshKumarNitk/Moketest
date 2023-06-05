public class Question2 {
    public static int firstUniqChar(String s) {
        int[] count = new int[26]; 
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First unique character in '" + s1 + "' is at index: " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First unique character in '" + s2 + "' is at index: " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First unique character in '" + s3 + "' is at index: " + firstUniqChar(s3));
    }
}
