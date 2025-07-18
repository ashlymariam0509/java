package pro;

public class Conditional_operators {

    public static void main(String[] args) {
        String username, password;
        username = "Ashlymariam";
        password = "java1234";

        if (username.equals("Ashlymariam") && password.equals("java1234")) {
            System.out.println("Authorized Login Successful");
        } else if (username.equals("user1") && !password.equals("java1234")) {
            System.out.println("Incorrect Password");
        } else if (!username.equals("user1") && password.equals("java1234")) {
            System.out.println("User Not Registered");
        } else {
            System.out.println("Incorrect UserID and Password");
        }
    }
}

