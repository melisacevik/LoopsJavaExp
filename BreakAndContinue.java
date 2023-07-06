public class BreakAndContinue {
    public static void main(String[] args) {

        /*
        for( int i = 0 ; i <= 10 ; i++){
            if( i == 5){
                System.out.println("i'nin değeri 5");
                continue;
            }
            System.out.println(i);
        }

         */

        /*
        //çift sayıları atlama
        int i =1;
        while(i <= 10){
            i++;
            if( i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        *\
         */

        for (int k = 0; k < 9; k++) {
            System.out.print("*");
            if (k == 3)
                break;
        }
    }
}
