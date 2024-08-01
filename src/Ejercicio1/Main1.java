package Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        User user = new User("admin", "1234", true);

        user.validateStatus();
        user.allowAccess();
    }
}
