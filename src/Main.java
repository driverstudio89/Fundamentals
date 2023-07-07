import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(new Date());
        String text = "";
        for (int i = 0; i < 1000000; i++) {
            text += "a";
        }
        System.out.println(new Date());

    }
}
