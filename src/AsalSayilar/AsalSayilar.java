
package AsalSayilar;

import java.util.Scanner;

    public class AsalSayilar {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int number = 0 ;
            int remainder = number % 2;
            boolean isPrime = true;

            System.out.println("Enter A Number: ");
            number = input.nextInt();

            if(number == 1) {
                System.out.println("Number İs Not Prime");
                return;

            }

            if(number < 1) {
                System.out.println("İnvalid Number!");
                return;

            }

            for(int i = 2 ; i < number ; i++ ) {
                if( number % i == 0) {
                    isPrime = false;
                }

            }
            if(isPrime) {
                System.out.println("Number İs Prime!");

            }
            else {
                System.out.println("Number İs Not Prime!");
            }

        }

    }




