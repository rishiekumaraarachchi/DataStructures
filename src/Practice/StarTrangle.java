package Practice;

public class StarTrangle {
    public static void main(String[] args) {
        drawTrangle();

    }

    static void drawTrangle(){
        int raw=4;
        for(int i=0;i<raw;i++){
            for(int j=raw;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
