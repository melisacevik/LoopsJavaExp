import java.util.Scanner;

//kullanıcı sayı girecek. negatif olduğu anda program bitecek. for ve while ile çöz.
// döngünün ne zaman biteceğini bilmediğimiz için while- do while daha kullanışlı
public class ForOrWhile {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int sayi;

        /*
        for(boolean run = true; run;){
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();

            if(sayi < 0 ){
                run = false;
                System.out.println("Negatif sayı girdiniz.");
            }
        }

         */

        do{
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
        }while(sayi > 0);
        System.out.println("Negatif sayı girdiniz.");

        //

    }
}
