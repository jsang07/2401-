package test;

public class Test1 {
    public static void main(String[] args) {
        String testString = "social";
        int count = countChar(testString, 'c');
        System.out.println("문자의 개수: " + count);
    }

    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
