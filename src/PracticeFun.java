import java.util.Scanner;

public class PracticeFun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String userInput = input.nextLine();

        String pigLatinWord = userInput
                .trim()
                .toLowerCase()
                .substring(1)
                .concat(userInput.substring(0, 1).toLowerCase())
                .concat("ay");
        System.out.println(pigLatinWord);
    }
}
