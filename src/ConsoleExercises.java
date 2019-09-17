import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        //***********
        double pi = 3.14159;
        System.out.format("\nThe value of pi is approximately %.2f.\n", pi);
        // ***********
        System.out.println("Enter an Integer: ");
        int userInt = input.nextInt();
        System.out.format("Your Integer is: %d\n", userInt);
        //************
        System.out.println("Enter three of your favorite words: ");
        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();
        System.out.format("Your Favorite Words are: \n%s\n%s\n%s", firstWord, secondWord, thirdWord);
        //************
        System.out.println("Enter a sentence: ");
        String userSentence = input.nextLine();
        System.out.format("\nYour sentence is: %s", userSentence);
        //************
        System.out.println("Enter length of codeup classroom:");
        int length = Integer.parseInt(input.nextLine());
        System.out.println("Enter width of codeup classroom:");
        int width = Integer.parseInt(input.nextLine());
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);
        System.out.format("The area of the classroom: %d\nThe perimeter of the classroom is: %d", area, perimeter);
    }

}
