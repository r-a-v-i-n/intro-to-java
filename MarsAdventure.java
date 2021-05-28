import java.util.Scanner;

class MarsAdventure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = input.nextLine();
        System.out.println("Hello, " + name + "! Are you ready for your adventure to Mars?");

        System.out.println("What color do you want your spacesuit be?");
        
        String color = input.nextLine();
        System.out.println("Nice, I like " + color + " too");

        
    }
}