import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean askPassword = true;

        do {
            System.out.print("Şifre giriniz : ");
            pass = input.nextInt();
            if ( pass == 123 ) {
                System.out.println("Doğru giriş");
                askPassword = false;
            }else{
                System.out.println("Hatalı giriş");
            }
        }while (askPassword);

    }
}
