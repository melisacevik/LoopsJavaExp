import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        int n, r, nFactorial = 1, rFactorial =1 , nOddrFactorial = 1, combination = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the n => ");
        n = input.nextInt();

        System.out.print("enter the r=> ");
        r = input.nextInt();

        for( int i= 1; i <= n || i <= r; i++){
            if( i <= n){
                nFactorial *= i;
            }
            if( i<= r){
                rFactorial *= i;
            }
        }

        if( (n -r ) > 0 ) {
            for ( int i =1; i <= (n-r) ; i++){
                nOddrFactorial *= i;
            }
        }

        combination = nFactorial / ( (rFactorial) * (nOddrFactorial));

        System.out.println("Combination ( C(n,r) = n! / (r! * (n-r)!) )  : " + combination);

    }
}
