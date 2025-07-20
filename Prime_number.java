package pro;
import java.util.Scanner;
public class Prime_number {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        boolean Prime = true;

        if (num <= 1) {
            Prime =false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }

        if (Prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close();
    }
}

