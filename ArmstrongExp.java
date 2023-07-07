// 3 basamaklı armstrong sayıları bulup ekrana yaz.

public class ArmstrongExp {
    public static void main(String[] args) {

        int number;
        int basValue;
        int basPow;
        int result;

        for( int i = 100; i < 1000 ; i++) {
            number = i;
            result = 0;

            while( number != 0){

                basValue = number % 10;
                basPow = 1;

                for( int j =1; j <= 3; j++){
                    basPow *= basValue;
                }
                result += basPow;
                number /= 10;
            }

            if (result == i) {
                System.out.println(i + " is an Armstrong number");
            }

        }
    }
}
