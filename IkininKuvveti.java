import java.util.Scanner;
public class IkininKuvveti {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        if( n > 0){
            for (int i = 1, j = 1; i <= n && j <= n; i *= 5, j *= 4) {
                System.out.println(j);
                System.out.println(i);
            }
        }else{
            System.out.println("Pozitif sayı girin.");
        }



    }
}
