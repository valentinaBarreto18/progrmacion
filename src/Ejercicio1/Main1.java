package Ejercicio1;

public class Main1 {
    public static void main(String[] args) {
        User user = new User();

        user.setSystemStatus(true);
        user.validateStatus();
        user.allowAccess();
    }
}
