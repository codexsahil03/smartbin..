
    

import java.util.Scanner;

public class ProposeDay {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your crush's name: ");
        String name = sc.nextLine();

        System.out.println("\nThinking...");
        Thread.sleep(1500);

        System.out.println("Analyzing feelings...");
        Thread.sleep(1500);

        System.out.println("Loading courage...");
        Thread.sleep(1500);

        System.out.println("\n💌 Message Generated 💌\n");

        System.out.println("Hey " + name + ",");
        Thread.sleep(1000);

        System.out.println("I don't have fancy lines or dramatic music,");
        Thread.sleep(1000);

        System.out.println("but I do have honest feelings and good intentions.");
        Thread.sleep(1000);

        System.out.println("So here it is...");
        Thread.sleep(1500);

        System.out.println("\n👉 Will you be the reason my code compiles without errors?");
        System.out.println("👉 Will you be my constant, not just a variable?");
        Thread.sleep(1500);

        System.out.println("\n❤️ Happy Propose Day ❤️");
        System.out.println("— From someone who means it.");

        sc.close();
    }
}
