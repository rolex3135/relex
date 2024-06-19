import java.util.Scanner;

public class Stue {
    public static void main(String[] args) {
        char ch='A';
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                if(i%2==0){
                    System.out.print((char)(j+64));

                }else{
                    System.out.print("#");

                }
                ch++;
            }
            System.out.println();
        }

    }
}
