package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int yourAge = 0;

        // reading all remainders
        int rem1 = scanner.nextInt();
        int rem2 = scanner.nextInt();
        int rem3 = scanner.nextInt();

        while (!(yourAge % 3 == rem1 && yourAge % 5 == rem2 && yourAge % 7 == rem3)) {
            yourAge += 1;
        }

        System.out.printf("Your age is %d; that's a good time to start programming!", yourAge);
    }
}
