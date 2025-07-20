package pro;
import java.util.Scanner;
public class common_divisor {
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int num1, num2;
	        System.out.print("Enter two numbers: ");
	        num1 = sc.nextInt();
	        num2 = sc.nextInt();

	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }

	        System.out.println("The common divisor is: " + num1);
	    }
	}


