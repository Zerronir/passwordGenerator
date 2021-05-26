import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789*_-&$";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            res.append(str.charAt(random.nextInt(str.length())));
        }
        System.out.println(res.toString());
    }
}
