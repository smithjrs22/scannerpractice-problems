import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name ?");
        String nameInput = scanner.nextLine();
        System.out.println( "Hi " + nameInput);
        scanner.close();
    }
}
