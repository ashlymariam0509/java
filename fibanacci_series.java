package pro;
import java.util.Scanner;
public class fibanacci_series {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the  number: ");
	        int num = sc.nextInt();

	        int a = 0;
	        int b = 1;

	        while (a <= num) {
	            System.out.print(a + " ");
	            int temp = a + b;
	            a = b;
	            b = temp;
	        }

	        sc.close();
	    }
	}


