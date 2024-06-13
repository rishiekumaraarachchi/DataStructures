package Codes;

public class StringReverse {
    public static void main(String[] args) {
        String st = "Rishie";
        String reversed = stringReverse(st);
        System.out.println(reversed);

    }

//    static String stringReverse(String st) {
//        StringBuilder reverse = new StringBuilder(st);
//        reverse.reverse();
//        return reverse.toString();
//    }

        static String stringReverse(String st) {
            StringBuilder sb = new StringBuilder();
            for (int i = st.length() - 1; i >= 0; i--) {
                sb.append(st.charAt(i));
            }
            return sb.toString();
        }
}
