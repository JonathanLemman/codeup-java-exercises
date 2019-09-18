import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Say something to Bob...");
        String inputBob = input.nextLine();
        String message;

        if(inputBob.endsWith("?")) {
            message = "Sure";
        } else if(inputBob.endsWith("!")) {
            message = "Whoa, chill out!";
        } else if(inputBob.equals("")) {
            message = "Fine";
        } else {
            message = "Whatever";
        }

        System.out.println(message);

    }
}
