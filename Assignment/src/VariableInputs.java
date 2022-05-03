import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text:");
        String response = scanner.nextLine();
        System.out.println("Enter an integer:");
        int responseInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double:");
        double responseDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        Boolean responseBoolean = Boolean.valueOf(scanner.nextLine());
        System.out.println("Your string is " + response);
        System.out.println("Your integer is " + responseInteger);
        System.out.println("Your double is " + responseDouble);
        System.out.println("Your boolean is " + responseBoolean);
    }
}
