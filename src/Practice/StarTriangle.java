package Practice;

public class StarTriangle {
    public static void main(String[] args) {
        drawTriangle();
    }

    static void drawTriangle() {
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i || i == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}



