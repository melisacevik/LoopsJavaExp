import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int n;
       System.out.print("Faktöriyel sayısını giriniz: ");
       n = scan.nextInt();
       int total = 1;

       for( int i=1 ; i <= n; i++){
           total *= i;
       }
        System.out.print(n + ". Faktöriyel: " + total);
    }
}
