public class StringReversal {

    public static void main(String[] args) {
        String s = "hotdog racecar bananas";
        String sBackwards = reverseString(s);
        System.out.println(sBackwards);
    }

    public static String reverseString(String s) {
        if (s.isEmpty())
            return s;

            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

