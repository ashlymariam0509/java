package pro;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter mobile number: ");
        long mobile = sc.nextLong();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter attendance: ");
        float attendance = sc.nextFloat();

        int mark = (attendance >= 100) ? 10 : (int)(attendance % 10);
        System.out.println("Mark from attendance: " + mark);

        sc.close();
    }
}
