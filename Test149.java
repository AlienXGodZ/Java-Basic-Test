//Simple Login System

public class Test149 {
    public static void main(String[] args) {

        String correctUser = "admin";
        String correctPass = "123";

        String user = "admin";   // change here
        String pass = "123";     // change here

        if (user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Login Success");
        }
        else {
            System.out.println("Wrong username or password");
        }
    }
}