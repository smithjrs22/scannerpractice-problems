import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String superheroName = "Batman";
        String superPower = "eat stinky cheese";
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String response = scanner.nextLine();
        System.out.println("What is their superpower?");
        String response2 = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("There was once a superhero named " + superheroName + " who had the power of " + superPower);
        System.out.println("As they grew older " + superheroName + " saw that the world needed them.");
        System.out.println(superheroName + " used their ability to " + superPower + " to save the world.");


    }
}
