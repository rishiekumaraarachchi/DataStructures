package Practice;

public class StringReverse {
    public static void main(String[] args) {
        String code = "Rishie";
        String reversedCode= reverse(code);
        System.out.println(reversedCode);

    }

    static String reverse(String code) {
        StringBuilder sb= new StringBuilder();
        for(int i=code.length()-1; i>=0;i--){
            sb.append(code.charAt(i));

        }
        return sb.toString();
    }

}
