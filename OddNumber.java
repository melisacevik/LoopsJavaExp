import java.util.Scanner;
public class OddNumber {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do{
            System.out.print("Lütfen sayı giriniz: ");
            n = scan.nextInt();

            if( n % 2 == 0 && n % 4 == 0){
                toplam += n;
            }

        }while( n % 2 == 0);

        System.out.println("Toplam: " + toplam);
    }
}
