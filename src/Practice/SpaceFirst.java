package Practice;

public class SpaceFirst {
    public static void main(String[] args) {
        drawStar();
    }

    public static void drawStar() {
        int rows = 4;
        for (int i = 0; i < rows; i++) {

            for (int k = rows - 1; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
