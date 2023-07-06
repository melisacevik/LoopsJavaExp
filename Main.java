
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int k;
        System.out.println("Program başladı");

        while(i <= 5){

            System.out.println(i);

            k = 1;

            while( k <= 10){
                System.out.print(k + ",");
                k++;
            }
            System.out.println();

            i++;

        }
        System.out.println("Program bitti");

        //---------------------------

        System.out.println("Başka örnek; ");
        int left = 100, right = 200;

        while(++left < --right);
        System.out.println(left);
        System.out.println(right);
    }
}