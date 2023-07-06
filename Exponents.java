
import java.util.Scanner;
public class Exponents {
    public static void main(String[] args) {

        int n, k;
        double total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        n = input.nextInt();

        System.out.print("Üssü giriniz: ");
        k = input.nextInt();

        if( n != 0 && k != 0){
            if( k > 0){
                for ( int i = 1; i <= k; i++){
                    total *= n;
                }
            }else{
                for( int i = 1; i <= -k ; i++){
                    total /= n;
                }
            }
            System.out.println( n + "^" + k + " işlem sonucu : " + total);

        }else if( n != 0 && k == 0){
            total = 1;
            System.out.println( n + "^" + k + " işlem sonucu : " + total);

        }else{
            System.out.println("Indefinite");

        }

    }
}
