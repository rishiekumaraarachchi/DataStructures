package Practice;

public class DownwardTrangle {
    public static void main(String[] args) {
        drawStar();
    }

    public static void drawStar() {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = rows-i; j >=1; j--) {
                System.out.print("*");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
