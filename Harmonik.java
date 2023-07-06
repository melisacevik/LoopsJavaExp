import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n :  ");
        int n = input.nextInt();
        double result = 0.0;

        for(int i = 0 ; i <= n; i++){
            result += ( 1.0 /n);
        }

        System.out.print("Result: " + result);
    }
}
