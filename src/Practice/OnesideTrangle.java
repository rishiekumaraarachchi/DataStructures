package Practice;

public class OnesideTrangle {
    public static void main(String[] args) {
        drawTriangle();
    }

    static void drawTriangle() {
        int raw= 4;
        for (int i=0; i<raw;i++){
            for (int j=0;j<=i;j++){
                if(j==0||j==i|| i == raw - 1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int k=raw-i;k>0;k--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
