package Practice;

public class StringReverse {
    public static void main(String[] args) {
        String code = "Rishie";
        String reversedCode = reverse(code);
        System.out.println("Reversed string: " + reversedCode);
    }

    static String reverse(String code) {
        // Use a StringBuilder for easier string manipulation
        StringBuilder reversed = new StringBuilder();

        // Iterate over the string from end to start and append each character to the StringBuilder
        for (int i = code.length() - 1; i >= 0; i--) {
            reversed.append(code.charAt(i));
        }

        // Convert the StringBuilder back to a String
        return reversed.toString();
    }
}
