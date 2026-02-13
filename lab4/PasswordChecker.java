public class PasswordChecker {

    public static boolean isValidPassword(String s) {
        if (s.length() < 5 || s.length() > 12)
            return false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch))
                return false;
            if (!Character.isLetterOrDigit(ch))
                return false;
            if (Character.isLowerCase(ch))
                hasLower = true;
            if (Character.isDigit(ch))
                hasDigit = true;
        }
        if (!hasLower || !hasDigit)
            return false;
        int n = s.length();
        for (int len = 1; len <= n/2; len++) {
            for (int i = 0; i <= n - 2*len; i++) {
                String part1 = s.substring(i, i + len);
                String part2 = s.substring(i + len, i + 2*len);
                if (part1.equals(part2))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] tests = {
            "abcanan1",
            "abc11se",
            "123sd123",
            "adfasdsdf",
            "Aasdfasd12",
            "abc12"
        };

        for (String p : tests)
            System.out.println(p + " -> " + isValidPassword(p));
    }
}

