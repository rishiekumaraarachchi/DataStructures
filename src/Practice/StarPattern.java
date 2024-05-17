package Practice;

public class StarPattern {
    public static void main(String[] args) {
        drawStar();
    }

    public static void drawStar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
