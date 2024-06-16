package Practices;

public class WithoutUseTemp {
    public static void main(String[] args) {
        int x=3,x1=5;
        System.out.print(x+",");
        System.out.println(x1);
        x=x+x1;
        x1=x-x1;
        x=x-x1;
        System.out.println("After Swapping");
        System.out.print(x+",");
        System.out.print(x1);
    }
}
