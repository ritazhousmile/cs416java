/**
 * BasicIOProgram lab
 * author: Huan Zhou
 * date: 08/28
 */


import java.util.Scanner;

public class BasicIOProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two whole numbers\nseparated by one or more spaces:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("You entered " + number1 + " and " + number2);

        scanner.nextLine();

        System.out.println("Next enter two numbers.\nA decimal point is OK.");
        double number3 = scanner.nextDouble();
        double number4 = scanner.nextDouble();
        System.out.println("You entered " + number3 + " and " + number4);
        scanner.nextLine();

        System.out.println("Next enter two words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"");
        scanner.nextLine();


        System.out.println("Next enter a line of text:");
        String lineOfText = scanner.nextLine();
        System.out.println("You entered: \"" + lineOfText+ "\"");
        scanner.close();


        
    }

}
