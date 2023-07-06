import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k, sum = 0, count =0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        for( int i=1; i <= k; i++){

            if( i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        if ( count >0 ){
            double average = (double) sum / count;
            System.out.println("Ortalama " + average);
        }else{
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
