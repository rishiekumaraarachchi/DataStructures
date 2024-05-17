public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = revereseString(s);
        System.out.println("Original  one :"+ s);
        System.out.println("Reversed one :"+ reversed);

    }

    public static String revereseString(String str){
        StringBuilder reverse= new StringBuilder();
        for(int i = str.length()-1 ; i>=0; i--){
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
}
