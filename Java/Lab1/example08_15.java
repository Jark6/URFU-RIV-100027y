import java.util.Scanner;
public class example08_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input A: ");
        int A = in.nextInt();
        System.out.print("Input B: ");
        int B = in.nextInt();
        int C = A + B;
        System.out.printf("A+B = %d \n", C);
        in.close();
    }
}
