package task3;

public class EmailValidator {
    public static void main(String[] args) {
        String email1 = "java@email.com";
        String email2 = "lpnu.email";

        System.out.println("Email 1 is valid: " + validateEmail(email1));
        System.out.println("Email 2 is valid: " + validateEmail(email2));
    }
    private static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

        if (atIndex < 0 || dotIndex < 0 || atIndex > dotIndex) {
            return false;
        }

        if (atIndex == 0 || dotIndex == email.length() - 1) {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '.' && i == atIndex - 1) {
                return false;
            }
        }

        return true;
    }

}
