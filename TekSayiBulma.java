import java.util.Scanner;

//sürekli sayı alacağız ve negatif olan sayıya kadar tekleri toplayacak
public class TekSayiBulma {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do{
            System.out.print("Bir sayı girin: ");
            n = scan.nextInt();

            if ( n % 2 == 1){
                toplam += n;
            }
        }while( n > 0);

        System.out.println("Toplam: " + toplam);
    }
}
