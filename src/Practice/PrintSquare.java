package Practice;

public class PrintSquare {
    public static void main(String[] args) {
        printSquare();

    }
    static void printSquare(){
        int raw = 4;
        for(int i=0;i<raw; i++){
            for (int j=0;j<raw;j++){
                if(i==0||i==raw-1||j==0||j==3){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
